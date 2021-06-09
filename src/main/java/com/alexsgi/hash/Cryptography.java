package com.alexsgi.hash;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * @author Alexander Sagorski
 * @since 1.0
 */
public class Cryptography {

    private static final String zero = "";
    private static int HASH_LENGTH = 512;
    private static String SHA3_256 = "SHA3-" + HASH_LENGTH;
    private static String SHA_256 = "SHA-" + HASH_LENGTH;

    public static String base64Encryption(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    public static String hashSHA2(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance(SHA_256);
            byte[] encodedHash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(encodedHash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return zero;
    }

    public static String hashSHA3(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance(SHA3_256);
            byte[] encodedHash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(encodedHash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return zero;
    }

    public static String hash(String input) {
        return hashSHA3(hashSHA2(base64Encryption(hashSHA3(hashSHA2(base64Encryption(input))))));
    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static String convertStringToHex(String s) {
        if (s.length() == 0)
            return "";
        char c;
        StringBuffer buff = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            buff.append(Integer.toHexString(c) + " ");
        }
        return buff.toString().trim();
    }

    public static String convertHexToString(String s) {
        if (s.length() == 0)
            return "";
        String[] arr = s.split(" ");
        StringBuffer buff = new StringBuffer();
        int i;
        for (String str : arr) {
            i = Integer.valueOf(str, 16).intValue();
            String hs = new Character((char) i).toString();
            buff.append(hs);
        }
        return buff.toString();
    }

    public static int getHashLength() {
        return HASH_LENGTH;
    }

    public static void setHashLength(int hashLength) {
        HASH_LENGTH = hashLength;
        SHA3_256 = "SHA3-" + HASH_LENGTH;
        SHA_256 = "SHA-" + HASH_LENGTH;
    }

    public static void resetHashLength() {
        HASH_LENGTH = 512;
        SHA3_256 = "SHA3-" + HASH_LENGTH;
        SHA_256 = "SHA-" + HASH_LENGTH;
    }

}
