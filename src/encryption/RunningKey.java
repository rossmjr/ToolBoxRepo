package encryption;

import java.util.Random;

public class RunningKey {
	
	private static String key;
	
	/**
	 * Encrypts the input with the given key, using a Running Key Vigenere Cipher, case is adjusted to uppercase.
	 * @param input - the message to be encrypted entered as a string
	 * @param key - the key by which to encrypt entered as a string(must be same length as the input message).
	 * @return - the encrypted message as a string.
	 */
	public static String encrypt(String input, String key){
		String output = input;
		StringBuilder sb = new StringBuilder();
		if(input.length() == key.length()){
			for(int i = 0; i < input.length(); i++){
				int temp = input.charAt(i) - 65;
				int temp2 = key.charAt(i) - 65;
				int temp3 = 91 - temp - temp2;
				if(temp3 > 90){
					temp3 = temp3 - 26;
				}if(temp3 < 65){
					temp3 = temp3 +26;
				}
				sb.append((char)(temp3));
			}
		}
//		sb.append("\n" + key);
		output = sb.toString();
		return output;
	}
	/**
	 * Encrypts the input with a randomly generated key, using a Running Key Vigenere Cipher, case is adjusted to uppercase
	 * @param input - the message to be encrypted entered as a string.
	 * @return - the encrypted message as a string, followed by a new line with the randomly generated key.
	 */
	public static String encrypt(String input){
		String output = input;
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < input.length(); i++){
			sb.append((char)(rand.nextInt(26)+65));
		}
		String key = sb.toString();
		setKey(key);
		output = encrypt(input, key);
		return output;
	}	
	/**
	 * Decrypts the input with the given key, using a Running Key Vigenere Cipher, case is adjusted to uppercase.
	 * @param input - the message to be decrypted entered as a string.
	 * @param key - the key by which to decrypted entered as a string.
	 * @return - the encrypted message as a string, followed by a new line with the randomly generated key.
	 */
	public static String decrypt(String input, String key){
		String output = input;
		StringBuilder sb = new StringBuilder();
		if(input.length() == key.length()){
			for(int i = 0; i < input.length(); i++){
				int temp = input.charAt(i) - 65;
				int temp2 = key.charAt(i) - 65;
				int temp3 = 91 - temp - temp2;
				if(temp3 < 65){
					temp3 = temp3 + 26;
				}if(temp3 > 90){
					temp3 = temp3 - 26;
				}
				sb.append((char)(temp3));
			}
		}
		output = sb.toString();
		return output;
	}
	public static String getKey() {
		return key;
	}
	private static void setKey(String keyy) {
		key = keyy;
	}
}
