package test.mock;

import main.mock.Cipher;

public class MockMD5Cipher implements Cipher {
    @Override
    public String encrypt(String source) {
        return "1234";
    }

    @Override
    public String decrypt(String source) {
        return "52a0623f6b9ad595edb0760abc6f770f";  //https://www.md5hashgenerator.com/
    }
}
