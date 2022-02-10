package io.rachidassouani.util;

import java.util.Base64;

public class CryptoUtil {

    public String fromBytesToBase64(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }

    public byte[] fromBase64ToBytes(String dataInBase64) {
        return Base64.getDecoder().decode(dataInBase64);
    }

    public String fromBytesToBase64URL(byte[] data) {
        return Base64.getUrlEncoder().encodeToString(data);
    }

    public byte[] fromBase64URLToBytes(String dataInBase64) {
        return Base64.getUrlDecoder().decode(dataInBase64);
    }
}
