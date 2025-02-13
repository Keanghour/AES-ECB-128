# generate_key.py

import secrets
import base64

def generate_aes_key():
    """
    Generates a random AES key (16 bytes for AES-128).
    Returns the key as a base64-encoded string.
    """
    # Generate a 16-byte random key (128-bit for AES-128)
    key = secrets.token_bytes(16)
    
    # Encode the key in base64 for easy handling
    base64_key = base64.b64encode(key).decode('utf-8')
    
    return base64_key

if __name__ == "__main__":
    # Generate AES key and print it
    aes_key = generate_aes_key()
    print(f"Generated AES key (Base64):\n{aes_key}")
