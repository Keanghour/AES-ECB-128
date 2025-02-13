# AES-ECB-128

---

# Encryption Helper

This project provides utility methods for AES encryption and decryption using Java, Python, and PHP.

## Overview

The `Helper.java` class contains methods for AES encryption and decryption using the **AES-128-ECB** algorithm. It includes:

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

### Security Considerations
- **ECB Mode:** The current implementation uses AES-128-ECB, which is **not recommended** for highly sensitive data due to its vulnerability to certain attacks. For better security, consider using AES with **CBC** or **GCM** modes.
  
- **Key Management:** Ensure the encryption key is stored securely and **never hardcoded** in production environments. Always use secure key management practices.

## Additional Notes
- This project uses **Base64 encoding** for the encrypted strings.
- Ensure to handle exceptions and errors properly, especially in production applications.

---

This README provides a succinct description of your `Helper.java` class along with security tips. You can include the same principles for the Python and PHP implementations based on your project structure.

---

---

## Contact

- Email: phokeanghour12@gmail.com
- Telegram: [@phokeanghour](https://t.me/phokeanghour)

<a href="https://t.me/phokeanghour" target="_blank" rel="noreferrer">
    <img src="https://www.vectorlogo.zone/logos/telegram/telegram-ar21.svg" />
</a>

<a href="https://www.linkedin.com/in/pho-keanghour-27133b21b/" target="_blank" rel="noreferrer">
    <img src="https://www.vectorlogo.zone/logos/linkedin/linkedin-ar21.svg" />
</a>

---
