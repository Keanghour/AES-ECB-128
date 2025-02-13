<?php

function generateBase64AESKey() {
    // Generate 128-bit (16-byte) key using random_bytes
    $randomKey = random_bytes(16);  // AES-128 requires a 16-byte key
    
    // Encode the key in base64 format
    return base64_encode($randomKey);
}

$key = generateBase64AESKey();
echo "Generated Base64 AES Key: " . $key . "\n";

?>
