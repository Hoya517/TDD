package test.hamcrest;

import org.junit.Test;

import static main.hamcrest.IsNotANumber.notANumber;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IsNotANumberTest {

    @Test
    public void testSquareRootOfMinusOneIsNotANumber() {
        assertThat(Math.sqrt(-1), is(notANumber()));
    }
}