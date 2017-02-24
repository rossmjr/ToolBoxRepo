package ciphers;

public class ROT13 {
	
//	public static void main(String[] args) {
//		System.out.println(encrypt("Why did the chicken cross the road?"));
//		System.out.println(decrypt("Gb trg gb gur bgure fvqr!"));
//		System.out.println(decrypt("Jul qvq gur puvpxra pebff gur ebnq?"));
//		System.out.println(encrypt("To get to the other side!"));
//		
//	}

	/**
	 * Encrypts the given message using the ROT13 cipher. Case is not adjusted.
	 * 
	 * @param message - The message to be encrypted
	 * @return The encrypted message
	 */
	public static String encrypt(String message){
		String encrypted = "";
		for(char c: message.toCharArray()){
			if(c >= 'A' && c <= 'M'){
				char n = (char) (c + 13);
				encrypted += n;
			} else if(c >= 'N' && c <= 'Z'){
				char n = (char) (c - 13);
				encrypted += n;
			} else if(c >= 'a' && c <= 'm'){
				char n = (char) (c + 13);
				encrypted += n;
			} else if(c >= 'n' && c <= 'z'){
				char n = (char) (c - 13);
				encrypted += n;
			} else {
				encrypted += c;
			}
		}
		return encrypted;
	}
	
	/**
	 * Decrypts the given message using the ROT13 cipher. Case is not adjusted.
	 * 
	 * @param message - The message to be decrypted
	 * @return The decrypted message
	 */
	public static String decrypt(String message){
		String encrypted = "";
		for(char c: message.toCharArray()){
			if(c >= 'A' && c <= 'M'){
				char n = (char) (c + 13);
				encrypted += n;
			} else if(c >= 'N' && c <= 'Z'){
				char n = (char) (c - 13);
				encrypted += n;
			} else if(c >= 'a' && c <= 'm'){
				char n = (char) (c + 13);
				encrypted += n;
			} else if(c >= 'n' && c <= 'z'){
				char n = (char) (c - 13);
				encrypted += n;
			} else {
				encrypted += c;
			}
		}
		return encrypted;
	}
}
