package ciphers;

public class ROT13 {
	
	public static void main(String[] args) {
		System.out.println(encrypt("nerf"));
		System.out.println(decrypt("Gb trg gb gur bgure fvqr!"));
		System.out.println(decrypt("Jul qvq gur puvpxra pebff gur ebnq?"));
		System.out.println(encrypt("To get to the other side!"));
		
	}

	public static String encrypt(String message){
		String e = "";
		for(char c: message.toCharArray()){
			if(c >= 'A' && c <= 'M'){
				char n = (char) (c + 13);
				e += n;
			} else if(c >= 'N' && c <= 'Z'){
				char n = (char) (c - 13);
				e += n;
			} else if(c >= 'a' && c <= 'm'){
				char n = (char) (c + 13);
				e += n;
			} else if(c >= 'n' && c <= 'z'){
				char n = (char) (c - 13);
				e += n;
			} else {
				e += c;
			}
		}
		return e;
	}
	
	public static String decrypt(String message){
		String e = "";
		for(char c: message.toCharArray()){
			if(c >= 'A' && c <= 'M'){
				char n = (char) (c + 13);
				e += n;
			} else if(c >= 'N' && c <= 'Z'){
				char n = (char) (c - 13);
				e += n;
			} else if(c >= 'a' && c <= 'm'){
				char n = (char) (c + 13);
				e += n;
			} else if(c >= 'n' && c <= 'z'){
				char n = (char) (c - 13);
				e += n;
			} else {
				e += c;
			}
		}
		return e;
	}
}
