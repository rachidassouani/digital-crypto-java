package io.rachidassouani.test;

import io.rachidassouani.util.CryptoUtilImpl;

public class Test1 {

    public static void main(String[] args) {

        String text = "Hello world!//+>>>";
        CryptoUtilImpl cryptoUtil = new CryptoUtilImpl();

        // from byte[] to base64
        String dataInBase64 = cryptoUtil.fromBytesToBase64(text.getBytes());
        System.out.println(dataInBase64);

        // from byte[] to base64URL
        String dataInBaseUrl64 = cryptoUtil.fromBytesToBase64URL(text.getBytes());
        System.out.println(dataInBaseUrl64);

        // from base64 to byte[]
        byte[] decodedInBytes = cryptoUtil.fromBase64ToBytes(dataInBase64);
        System.out.println(new String(decodedInBytes));
    }
}
