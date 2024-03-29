package test.testdouble;

import main.testdouble.ICoupon;
import main.testdouble.Item;

public class StubCoupon implements ICoupon {
    @Override
    public String getName() {
        return "VIP 고객 한가위 감사쿠폰";
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public int getDiscountPercent() {
        return 7;
    }

    @Override
    public boolean isApplicable(Item item) {
        if ("부엌칼".equals(item.getCategory())) {
            return true;
        } else if ("알람시계".equals(item.getCategory())) {
            return false;
        }
        return false;
    }

    @Override
    public void doExpire() {

    }
}
