package io.rachidassouani.util;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class SymmetricCryptoUtil {

    public SecretKey generateSecretKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        return keyGenerator.generateKey();
    }

    public SecretKey generateSecretKey(String secret) throws Exception {
        SecretKey secretKey = new SecretKeySpec(secret.getBytes(), 0, secret.length(), "AES");
        return secretKey;
    }

    public String encryptUsingAES(byte[] data, SecretKey secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance("AES"); //Advanced Encryption Standard
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedData = cipher.doFinal(data);

        return Base64.getEncoder().encodeToString(encryptedData);
    }

    public byte[] decryptUsingAES(String data, SecretKey secretKey) throws Exception {
        byte[] decodedData = Base64.getDecoder().decode(data);

        Cipher cipher = Cipher.getInstance("AES"); //Advanced Encryption Standard
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        return cipher.doFinal(decodedData);
    }
}
