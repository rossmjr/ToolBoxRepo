package demos;

import encryption.RunningKey;
import encryption.Sub347;

public class Cypher {

	public static void testSub(){
		String encrypted = Sub347.encrypt("Hello");
		System.out.println(encrypted);
		String decrypted = Sub347.decrypt(encrypted);
		System.out.println(decrypted);
	}
	public static void testRunningKey(){
		String encrypted = RunningKey.encrypt("HELLOWORLD", "BACONLOVER");
		System.out.println(encrypted);
		String decrypted = RunningKey.decrypt("IENZBHCMPU", "BACONLOVER");
		System.out.println(decrypted);
	}
}
