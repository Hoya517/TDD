package test.mock;

import main.mock.UserRegister;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegisterTest {

    @Test
    public void testSavePassword() throws Exception {
        UserRegister register = new UserRegister();

        String userId = "hoya";
        String password = "1234";

        register.savePassword(userId, password);
        assertEquals(password, register.getPassword());
    }
}
