package encryption;

public class XOR {

	/**
	 * This method can be used to both encrypt or decrypt using XOR Cipher, as the formula is the same, it takes in the String to be
	 * converted, and the char to use as the key to encrypt/decrypt the String.
	 * @param input - Type String, message to be converted.
	 * @param key - Type Char, key for the encryption.
	 * @return - returns the encrypted value as a String.
	 */
	public static String encrypt(String input, char key){
		String output = input;
		byte[] conversion = input.getBytes();
		int key1 = key;
		for(int i = 0; i < conversion.length; i++){
			conversion[i] = (byte)(conversion[i] ^ key1);
		}
		output = new String(conversion);
		return output;
	}
	/**
	 * This method can be used to both encrypt or decrypt using XOR Cipher, as the formula is the same, it takes in the String to be
	 * converted, and the char to use as the key to encrypt/decrypt the String.
	 * @param input - Type String, message to be converted.
	 * @param key - Type Char, key for the encryption.
	 * @return - returns the encrypted value as a String.
	 */
	public static String decrypt(String input, char key){
		String output = input;
		byte[] conversion = input.getBytes();
		int key1 = key;
		for(int i = 0; i < conversion.length; i++){
			conversion[i] = (byte)(conversion[i] ^ key1);
		}
		output = new String(conversion);
		return output;
	}
}
