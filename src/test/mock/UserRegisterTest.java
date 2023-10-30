package test.mock;

import main.mock.Cipher;
import main.mock.UserRegister;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegisterTest {

    @Test
    public void testSavePassword() throws Exception {
        UserRegister register = new UserRegister();
        Cipher cipher = new MockMD5Cipher();

        String userId = "hoya";
        String password = "1234";

        register.savePassword(userId, cipher.encrypt(password));
        String decryptedPassword = cipher.decrypt(register.getPassword());
        assertEquals(password, decryptedPassword);
    }
}
