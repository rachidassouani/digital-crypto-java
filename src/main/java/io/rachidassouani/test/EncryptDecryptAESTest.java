package io.rachidassouani.test;

import io.rachidassouani.util.SymmetricCryptoUtil;

import javax.crypto.SecretKey;

public class EncryptDecryptAESTest {

    public static void main(String[] args) throws Exception {

        // new instance of my util class
        SymmetricCryptoUtil symmetricCryptoUtil = new SymmetricCryptoUtil();

        // data that needed to be encrypted
        final String data = "Hello world,";

        //secret key
        final String secret = "rachid_assouani_";

        SecretKey secretKey = symmetricCryptoUtil.generateSecretKey(secret);
        String encryptUsingAES = symmetricCryptoUtil.encryptUsingAES(data.getBytes(), secretKey);
        System.out.println(encryptUsingAES);

        /*
            reversing from encrypted data to the data itself (since I already know the secret key)
         */
        byte[] decryptUsingAES = symmetricCryptoUtil.decryptUsingAES(encryptUsingAES, secretKey);
        System.out.println(new String(decryptUsingAES));

    }
}
