package test.hamcrest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HamcrestTest {
    @Test
    public void testArray() throws Exception {
        assertThat("Start Date 비교", "2023/10/20", is("2023/10/21"));
//        java.lang.AssertionError: Start Date 비교
//        Expected: is "2023/10/21"
//        but: was "2023/10/20"
//        Expected :2023/10/21
//        Actual   :2023/10/20
    }
}
