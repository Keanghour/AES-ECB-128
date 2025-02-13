import java.security.SecureRandom;
import java.util.Base64;

public class AESKeyGenerator {

    public static String generateAESKey() {
        // Create a SecureRandom instance to generate secure random bytes
        SecureRandom secureRandom = new SecureRandom();

        // Generate a 16-byte random key (128-bit for AES-128)
        byte[] key = new byte[16];
        secureRandom.nextBytes(key);

        // Encode the key in base64 for easy handling
        return Base64.getEncoder().encodeToString(key);
    }

    public static void main(String[] args) {
        // Generate AES key and print it
        String aesKey = generateAESKey();
        System.out.println("Generated AES key (Base64):\n" + aesKey);
    }
}
