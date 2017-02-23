package demos;

import encryption.Sub347;

public class Cypher {

	public static void testSub(){
		String encrypted = Sub347.encrypt("Hello");
		System.out.println(encrypted);
		String decrypted = Sub347.decrypt(encrypted);
		System.out.println(decrypted);
	}
}
