package main.testdouble;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private List<ICoupon> list = new ArrayList<>();

    public User(String userId) {
        this.userId = userId;
    }

    public int getTotalCouponCount() {
        return list.size();
    }

    public void addCoupon(ICoupon coupon) {
        list.add(coupon);
    }
}
