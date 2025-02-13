<?php

class AESEncryptionDecryptionClass {
    private static $key;
    private static $secretKey;

    public static function encryptAES($strToEncrypt, $secret) {
        try {
            self::setKey($secret);
            $cipher = "AES-128-ECB";
            return base64_encode(openssl_encrypt($strToEncrypt, $cipher, self::$secretKey, OPENSSL_RAW_DATA));
        } catch (Exception $e) {
            echo "Error while encrypting: " . $e->getMessage();
        }
        return null;
    }

    private static function setKey($myKey) {
        try {
            self::$key = substr(hash('sha1', $myKey, true), 0, 16);
            self::$secretKey = self::$key;
        } catch (Exception $e) {
            echo "Error setting key: " . $e->getMessage();
        }
    }
}

$data = "Hello";  // Your plaintext data
$secretKey = "=FIQpAaQHXRHelgGiCgPliXDtuaWHpywZFDwmNtOPeRyYOtGUFw";  // Your secret key

$encryptedData = AESEncryptionDecryptionClass::encryptAES($data, $secretKey);
echo "Encrypted data: \n" . $encryptedData . "\n";
