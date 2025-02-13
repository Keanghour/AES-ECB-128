// Encrypt.java

public class Encrypt {

    public static void main(String[] args) {
        try {
            // Secret key to be used for encryption/decryption
            String secretKey = "=FIQpAaQHXRHelgGiCgPliXDtuaWHpywZFDwmNtOPeRyYOtGUFw";
            // Data to be encrypted
            String dataToEncrypt = "Testing data for encryption ....";

            // Setup the key using the Helper class
            Helper.setKey(secretKey);

            // Encrypt the data
            String encryptedData = Helper.encrypt(dataToEncrypt);

            // Print the encrypted data
            System.out.println("Encrypted data: " + encryptedData);
        } catch (Exception e) {
            System.out.println("Error during encryption: " + e.toString());
        }
    }
}
