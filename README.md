# AES-128-ECB

---

# Encryption Helper

This project provides utility methods for AES encryption and decryption using **Java**, **PHP**, and **Python**.

## Overview

The `Helper.java` class (and equivalents in PHP and Python) contains methods for AES encryption and decryption using the **AES-128-ECB** algorithm. It includes:

- **Key Generation:** Generates a 128-bit AES key by applying SHA-1 to a given secret key.
- **Encryption:** Encrypts a string using AES and returns the result in Base64 format.
- **Decryption:** Decrypts a Base64-encoded string back to its original form.

## Usage

### Java

1. **Set up the AES Key:**
   ```java
   Helper.setKey("yourSecretKey");
   ```

2. **Encrypt a String:**
   ```java
   String encrypted = Helper.encrypt("textToEncrypt");
   ```

3. **Decrypt a String:**
   ```java
   String decrypted = Helper.decrypt(encryptedText);
   ```

### PHP

1. **Set up the AES Key and Encrypt a String:**
   ```php
   $data = 'Your plaintext data';  
   $secretKey = "Your secret key"; 
   
   $encryptedData = AESEncryptionDecryptionClass::encryptAES($data, $secretKey);
   echo "Encrypted data: " . $encryptedData . "\n";
   ```

2. **Decrypt a String:**
   ```php
   $decryptedData = AESEncryptionDecryptionClass::decryptAES($encryptedData, $secretKey);
   echo "Decrypted data: " . $decryptedData . "\n";
   ```

### Python

1. **Set up the AES Key:**
   ```python
   key = set_key("yourSecretKey")
   ```

2. **Encrypt a String (using the `cryptography` library or other AES libraries):**
   Encryption logic is similar, but you'd need a library like `cryptography` or `pycryptodome` for full encryption/decryption operations.

3. **Decrypt a String (using the same library as encryption):**
   Decrypting a string works similarly to encryption in Python with the same AES library.

### Security Considerations

- **ECB Mode:** The current implementation uses **AES-128-ECB**, which is **not recommended** for highly sensitive data due to its vulnerability to certain attacks. For better security, consider using AES with **CBC** or **GCM** modes.
  
- **Key Management:** Ensure the encryption key is stored securely and **never hardcoded** in production environments. Always use secure key management practices.

## Additional Notes

- This project uses **Base64 encoding** for the encrypted strings.
- Ensure to handle exceptions and errors properly, especially in production applications.

---

This `README` provides clear instructions on how to use AES encryption and decryption in Java, PHP, and Python, and it includes security recommendations as well.

---

This README provides a succinct description of your `Helper.java` class along with security tips. You can include the same principles for the Python and PHP implementations based on your project structure.

---

## Contact

- Email: phokeanghour12@gmail.com
- Telegram: [@phokeanghour](https://t.me/phokeanghour)

<a href="https://t.me/phokeanghour" target="_blank" rel="noreferrer">
    <img src="https://www.vectorlogo.zone/logos/telegram/telegram-ar21.svg" />
</a>

---

<a href="https://www.linkedin.com/in/pho-keanghour-27133b21b/" target="_blank" rel="noreferrer">
    <img src="https://www.vectorlogo.zone/logos/linkedin/linkedin-ar21.svg" />
</a>

---
