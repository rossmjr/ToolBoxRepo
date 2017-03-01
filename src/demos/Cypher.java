package demos;

import encryption.RunningKey;
import encryption.Sub347;
import encryption.XOR;

public class Cypher {

	/**
	 * Method for testing and demonstrating the Sub347 Class
	 */
	public static void testSub(){
		String encrypted = Sub347.encrypt("Hello");
		System.out.println(encrypted);
		String decrypted = Sub347.decrypt(encrypted);
		System.out.println(decrypted);
	}
	/**
	 * Method for testing and demonstrating the Running Key Vigenere Class
	 */
	public static void testRunningKey(){
		String encrypted = RunningKey.encrypt("HELLOWORLD", "BACONLOVER");
		System.out.println(encrypted);
		String decrypted = RunningKey.decrypt("SWNBZTYOLG", "BACONLOVER");
		System.out.println(decrypted);
	}
	public static void testXOR(){
		String encrypted = XOR.encrypt("Hello", '!');
		System.out.println(encrypted);
		String decrypted = XOR.decrypt(encrypted, '!');
		System.out.println(decrypted);
	}
}
