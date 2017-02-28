package encryption;

public class Beaufort {
	// input - key = t
	// 90 - t = output

	 public static void main(String[] args) {
	 System.out.println(encrypt("HELLO", "KEY"));
	 System.out.println(decrypt("danzq".toUpperCase(), "KEY"));
	 System.out.println(encrypt("hello", "key"));
	 System.out.println(decrypt("danzq".toUpperCase(), "key"));
	 }

	/**
	 * Encrypts the given message using the Beaufort cipher. Case is adjusted to uppercase.
	 * 
	 * @param message - The message to be encrypted
	 * @param key - The key to encrypt the message by
	 * @return The encrypted message
	 */
	public static String encrypt(String message, String keyI) {
		String encrypted = "";
		message = message.toUpperCase();
		keyI = keyI.toUpperCase();
		String key = keyI;
		int count = 0;
		if(key.length() < message.length()){
		while(key.length() < message.length()){
			key = key + keyI.charAt(count++);
			if(count == keyI.length()){
				count = 0;
			}
		}
		}
		for(int  i = 0; i < message.length(); i++){
			int m = message.charAt(i);
			int k = key.charAt(i);
			int o = 91 - (m - k);
			if(o > 90){
				o -= 26;
			} else if(o < 65){
				o += 26;
			}
			encrypted += (char)o;
		}
		return encrypted;
	}

	/**
	 * Decrypts the given message using the Beaufort cipher.  Case is adjusted to uppercase.
	 * 
	 * @param message - The message to be decrypted
	 * @param key - The key to decrypt the message by
	 * @return The decrypted message
	 */
	public static String decrypt(String message, String keyI) {
		String decrypted = "";
		message = message.toUpperCase();
		keyI = keyI.toUpperCase();
		String key = keyI;
		int count = 0;
		while(key.length() < message.length()){
			key = key + keyI.charAt(count++);
			if(count == keyI.length()){
				count = 0;
			}
		}
		for(int  i = 0; i < message.length(); i++){
			int m = message.charAt(i);
			int k = key.charAt(i);
			int o = 91 - (m - k);
			if(o > 90){
				o -= 26;
			} else if(o < 65){
				o += 26;
			}
			decrypted += (char)o;
		}
		return decrypted;
	}

}
