# decrypt.py

import base64
from Crypto.Cipher import AES
from helper import set_key

def decrypt_aes(encrypted_data, secret_key):
    """
    Decrypt the encrypted data using AES-128-ECB encryption method.
    """
    try:
        # Prepare the secret key using helper function
        key = set_key(secret_key)
        
        # Create AES cipher using the key
        cipher = AES.new(key, AES.MODE_ECB)
        
        # Decode the base64 encoded encrypted data
        encrypted_data = base64.b64decode(encrypted_data)
        
        # Decrypt the data
        decrypted_data = cipher.decrypt(encrypted_data).decode()
        
        # Remove padding
        pad_len = ord(decrypted_data[-1])
        decrypted_data = decrypted_data[:-pad_len]
        
        return decrypted_data

    except Exception as e:
        print(f"Error while decrypting: {e}")
        return None


if __name__ == "__main__":
    # Sample encrypted data (can be passed from encrypt.py output)
    encrypted_data = "oRUDFhfLSKvc4HwyIkq/8g=="
    secret_key = "=FIQpAaQHXRHelgGiCgPliXDtuaWHpywZFDwmNtOPeRyYOtGUFw"  # Your secret key

    decrypted_data = decrypt_aes(encrypted_data, secret_key)
    print(f"Decrypted data: \n{decrypted_data}")
