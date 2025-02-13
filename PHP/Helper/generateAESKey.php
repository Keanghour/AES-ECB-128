<?php

function generateAESKey() {
    // Generate 128-bit (16-byte) key using random_bytes
    // AES-128 requires a 16-byte key
    return bin2hex(random_bytes(16)); // Converts binary data to hexadecimal
}

$key = generateAESKey();
echo "Generated AES Key: " . $key . "\n";

?>
