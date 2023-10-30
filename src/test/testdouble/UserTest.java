package test.testdouble;

import main.testdouble.ICoupon;
import main.testdouble.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testAddCoupon() throws Exception {
        User user = new User("hoya");
        assertEquals("쿠폰 수령 전", 0, user.getTotalCouponCount());

        ICoupon coupon = null;

        user.addCoupon(coupon);
        assertEquals("쿠폰 수령 후", 1, user.getTotalCouponCount());
    }
}
