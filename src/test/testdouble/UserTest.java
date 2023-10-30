package test.testdouble;

import main.testdouble.ICoupon;
import main.testdouble.Item;
import main.testdouble.PriceCalculator;
import main.testdouble.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testAddCoupon() throws Exception {
        User user = new User("hoya");
        assertEquals("쿠폰 수령 전", 0, user.getTotalCouponCount());

        ICoupon coupon = new DummyCoupon();

        user.addCoupon(coupon);
        assertEquals("쿠폰 수령 후", 1, user.getTotalCouponCount());
    }

    @Test
    public void testGetLastOccupiedCoupon() throws Exception {
        User user = new User("hoya");
        ICoupon eventCoupon = new StubCoupon();
        user.addCoupon(eventCoupon);
        ICoupon lastCoupon = user.getLastOccupiedCoupon();

        assertEquals("쿠폰 할인율", 7, lastCoupon.getDiscountPercent());
        assertEquals("쿠폰 이름", "VIP 고객 한가위 감사쿠폰", lastCoupon.getName());
    }

    @Test
    public void testGetOrderPrice_discountableItem() throws Exception {
        PriceCalculator calculator = new PriceCalculator();
        Item item = new Item("LightSavor", "부엌칼", 100000);
        ICoupon coupon = new StubCoupon();

        assertEquals("쿠폰으로 인해 할인된 가격", 93000, calculator.getOrderPrice(item, coupon));
    }

    @Test
    public void testGetOrderPrice_undiscountableItem() throws Exception {
        PriceCalculator calculator = new PriceCalculator();
        Item item = new Item("R2D2", "알람시계", 20000);
        ICoupon coupon = new StubCoupon();  //new FakeCoupon();

        assertEquals("쿠폰 적용 안 되는 아이템", 20000, calculator.getOrderPrice(item, coupon));
    }
}
