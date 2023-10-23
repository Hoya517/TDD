package test;

import main.Account;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AccountTest {

    @Test
    public void testAccount() throws Exception {
        Account account = new Account(10000);
    }

    @Test
    public void testGetBalance() throws Exception {
        Account account = new Account(10000);
        assertEquals(10000, account.getBalance());

        account = new Account(1000);
        assertEquals(1000, account.getBalance());

        account = new Account(0);
        assertEquals(0, account.getBalance());
    }
}