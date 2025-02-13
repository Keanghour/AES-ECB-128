// Decrypt.java

public class Decrypt {

    public static void main(String[] args) {
        try {
            // Secret key to be used for encryption/decryption
            String secretKey = "=FIQpAaQHXRHelgGiCgPliXDtuaWHpywZFDwmNtOPeRyYOtGUFw";
            // The encrypted data (Base64 encoded) to be decrypted
            String encryptedData = "xiH0gTJvm/Dfx8RMN7GoFCrcOSX/RBJrYOUPAbGQ1KzwiiDyJc+3Y/3ALzHvBk/K";

            // Setup the key using the Helper class
            Helper.setKey(secretKey);

            // Decrypt the data
            String decryptedData = Helper.decrypt(encryptedData);

            // Print the decrypted data
            System.out.println("Decrypted data: " + decryptedData);
        } catch (Exception e) {
            System.out.println("Error during decryption: " + e.toString());
        }
    }
}
