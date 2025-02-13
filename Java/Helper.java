// Helper.java

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;

public class Helper {

    private static SecretKeySpec secretKey;

    /**
     * This method sets up the AES key using SHA-1 hashing and returns a
     * SecretKeySpec.
     * 
     * @param myKey The secret key string.
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static void setKey(String myKey) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] key = myKey.getBytes("UTF-8");
        MessageDigest sha = MessageDigest.getInstance("SHA-1");
        key = sha.digest(key);
        key = java.util.Arrays.copyOf(key, 16); // AES key must be 16 bytes for AES-128
        secretKey = new SecretKeySpec(key, "AES");
    }

    /**
     * Encrypts a string using AES encryption.
     * 
     * @param strToEncrypt The string to be encrypted.
     * @return The encrypted string in Base64 format.
     */
    public static String encrypt(String strToEncrypt) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encrypted = cipher.doFinal(strToEncrypt.getBytes("UTF-8"));
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    /**
     * Decrypts a string using AES decryption.
     * 
     * @param strToDecrypt The Base64-encoded string to be decrypted.
     * @return The decrypted string.
     */
    public static String decrypt(String strToDecrypt) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(strToDecrypt));
            return new String(decrypted);
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
}
