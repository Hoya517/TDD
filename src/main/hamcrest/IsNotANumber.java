package main.hamcrest;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class IsNotANumber extends TypeSafeMatcher<Double> {

    @Override
    protected boolean matchesSafely(Double number) {
        return number.isNaN();
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("not a number");
    }

    @Factory
    public static <T> Matcher<Double> notANumber() {
        return new IsNotANumber();
    }
}
