package test;

import junit.framework.TestCase;
import main.Account;

import static org.junit.Assert.assertEquals;

public class AccountTestWithJUnit3 extends TestCase {   //1.TestCase를 상속

    //2.테스트에 사용할 테스트 픽스처를 정의
    private Account account;
//    private Connection connection;

    public AccountTestWithJUnit3() {
        System.out.println("Constructor was called");
    }

    public void setUp() throws Exception {
        //3.setUp()을 사용해 픽스처의 상태를 초기화
        account = new Account(10000);
//        connection = new Connection("127.0.0.1");
    }

    //4.이름이 test로 시작하는 테스트 케이스를 작성
    public void testGetBalance() {
        assertEquals(10000, account.getBalance());
    }

    public void testDeposit() {
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }

    public void testWithDraw() {
        account.withDraw(1000);
        assertEquals(9000, account.getBalance());
    }

    //5.tearDown 테스트를 마친 다음 픽스처를 정리할 코드를 작성
    public void tearDown() throws Exception {
//        connection.close();
    }
}