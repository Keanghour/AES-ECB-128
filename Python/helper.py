# helper.py

import hashlib

def set_key(secret_key):
    """
    Generate a 16-byte key from the given secret using SHA-1.
    """
    # Use SHA1 to hash the key and take the first 16 bytes.
    key = hashlib.sha1(secret_key.encode()).digest()[:16]
    return key
