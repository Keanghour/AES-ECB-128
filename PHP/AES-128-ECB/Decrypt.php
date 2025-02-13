<?php

class AESEncryptionDecryptionClass {
    private static $key;
    private static $secretKey;

    public static function decryptAES($strToDecrypt, $secret) {
        try {
            self::setKey($secret);
            $cipher = "AES-128-ECB";
            return openssl_decrypt(base64_decode($strToDecrypt), $cipher, self::$secretKey, OPENSSL_RAW_DATA);
        } catch (Exception $e) {
            echo "Error while decrypting: " . $e->getMessage();
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

$data = "coJgL1NDyOoTxbYwwVfR3ps+ZAveuxO4a61RfBk7FEaV08U74MqQfTGAsGTqqI9RZUphW6M0KwVsB4xjNnuFMrnYLDzwETUQ3prQ6ydVCg3IzwvdD32ai5Gtr+t1V4Xf8z7gCkFjsZgmO65S7ydAY+Fbunpw/DY0vpBjTqMkugXPE8BAzCDhcojSvFEpayLH";  // Your encrypted data
$secretKey = "=FIQpAaQHXRHelgGiCgPliXDtuaWHpywZFDwmNtOPeRyYOtGUFw";  // Your secret key

$decryptedData = AESEncryptionDecryptionClass::decryptAES($data, $secretKey);
echo "Decrypted data: " . $decryptedData . "\n";
