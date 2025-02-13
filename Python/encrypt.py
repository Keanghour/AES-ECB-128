# encrypt.py

import base64
from Crypto.Cipher import AES
from helper import set_key

def encrypt_aes(data, secret_key):
    """
    Encrypt the data using AES-128-ECB encryption method.
    Returns the encrypted data in base64 encoding.
    """
    try:
        # Prepare the secret key using helper function
        key = set_key(secret_key)
        
        # Create AES cipher using the key
        cipher = AES.new(key, AES.MODE_ECB)
        
        # Ensure the data is a multiple of AES block size (16 bytes)
        # Padding data to make it block-aligned
        pad_len = 16 - (len(data) % 16)
        data = data + chr(pad_len) * pad_len
        
        # Encrypt the data
        encrypted_data = cipher.encrypt(data.encode())
        
        # Return base64 encoded encrypted data
        return base64.b64encode(encrypted_data).decode()

    except Exception as e:
        print(f"Error while encrypting: {e}")
        return None


if __name__ == "__main__":
    data = 'Testing'  # Your plaintext data
    secret_key = "=FIQpAaQHXRHelgGiCgPliXDtuaWHpywZFDwmNtOPeRyYOtGUFw"  # Your secret key

    encrypted_data = encrypt_aes(data, secret_key)
    print(f"Encrypted data: \n{encrypted_data}\n")
