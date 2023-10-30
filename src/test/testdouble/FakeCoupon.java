package test.testdouble;

import main.testdouble.ICoupon;
import main.testdouble.Item;

import java.util.ArrayList;
import java.util.List;

public class FakeCoupon implements ICoupon {

    List<String> categoryList = new ArrayList<>();

    public FakeCoupon() {
        categoryList.add("부엌칼");
        categoryList.add("아동 장난감");
        categoryList.add("조리기구");
    }

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
        if (this.categoryList.contains(item.getCategory())) {
            return true;
        }
        return false;
    }

    @Override
    public void doExpire() {

    }
}
