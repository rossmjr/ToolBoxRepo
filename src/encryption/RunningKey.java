package encryption;

import java.util.Random;

public class RunningKey {

	public static String encrypt(String input, String key){
		String output = input;
		StringBuilder sb = new StringBuilder();
		if(input.length() == key.length()){
			for(int i = 0; i < input.length(); i++){
				char temp = (char)(input.charAt(i) - 65);
				char temp2 = (char)(key.charAt(i) - 65);
				int temp3 = temp + temp2 + 65;
				if(temp3 > 90){
					temp3 = temp3 - 26;
				}
				sb.append((char)(temp3));
			}
		}sb.append("\n" + key);
		output = sb.toString();
		return output;
	}
	public static String encrypt(String input){
		String output = input;
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < input.length(); i++){
			sb.append((char)(rand.nextInt(26)+65));
		}
		String key = sb.toString();
		output = encrypt(input, key);
		return output;
	}
	public static String decrypt(String input, String key){
		String output = input;
		StringBuilder sb = new StringBuilder();
		if(input.length() == key.length()){
			for(int i = 0; i < input.length(); i++){
				int temp = input.charAt(i) - 65;
				int temp2 = key.charAt(i) - 65;
				int temp3 = temp - temp2 + 65;
				if(temp3 < 65){
					temp3 = temp3 + 26;
				}
				sb.append((char)(temp3));
			}
		}
		output = sb.toString();
		return output;
	}
}
