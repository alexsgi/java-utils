package hash;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Cryptography {

    private static int HASH_LENGTH = 512;
    private static String SHA3_256 = "SHA3-" + HASH_LENGTH;
    private static String SHA_256 = "SHA-" + HASH_LENGTH;
    private static final String zero = "";

    private static String base64Encryption(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    private static String hashSHA(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance(SHA_256);
            byte[] encodedhash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(encodedhash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return zero;
    }

    private static String hashSHA3(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance(SHA3_256);
            byte[] encodedhash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(encodedhash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return zero;
    }

    public static String hash(String input) {
        return hashSHA3(hashSHA(base64Encryption(hashSHA3(hashSHA(base64Encryption(input))))));
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

    public void setHashLength(int hashLength) {
        HASH_LENGTH = hashLength;
        SHA3_256 = "SHA3-" + HASH_LENGTH;
        SHA_256 = "SHA-" + HASH_LENGTH;
    }

    public int getHashLength() {
        return HASH_LENGTH;
    }

    public void resetHashLength() {
        HASH_LENGTH = 512;
        SHA3_256 = "SHA3-" + HASH_LENGTH;
        SHA_256 = "SHA-" + HASH_LENGTH;
    }

}
