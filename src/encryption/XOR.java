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
		input = input.toUpperCase();
		String output = input;
		byte[] conversion = input.getBytes();
		int key1 = key;
		for(int i = 0; i < conversion.length; i++){
			conversion[i] = (byte)(conversion[i] ^ key1);
		}
		StringBuilder sb = new StringBuilder();
		for(byte b : conversion){
			sb.append(b + " ");
		}
		output = sb.toString();
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
		String output = "";
		int[] in = new int[input.length()];
		int key1 = key;
		int count = 0;
		for(String s : input.split(" ")){
			in[count++] = Integer.parseInt(s);
		}
		for(int i = 0; i < count; i++){
			output += (char) ((in[i]) ^ key1);
		}
//		input = new String(in);
//		byte[] conversion = input.getBytes();
//		for(int i = 0; i < conversion.length; i++){
//			conversion[i] = (byte)(conversion[i] ^ key1);
//			
//		}
//		output = new String(conversion);
		return output;
	}
}
