package encryption;

public class Sub347 {

	public static String encrypt(String input){
		String output;
		char[] converted = new char[input.length() *3];
		for(int i = 0; i < input.length(); i++){
			int j = i*3;
			converted[j] = (char)(input.charAt(i)-3);
			converted[j+1] = (char)(input.charAt(i)+4);
			converted[j+2] = (char)(input.charAt(i)+7);
		}
		StringBuilder sb = new StringBuilder();
		for(char c : converted){
			sb.append(c);
		}
		output = sb.toString();
		return output;
	}
	public static String decrypt(String input){
		String output;
		char[] converted = new char[input.length()/3];
		for(int i = 0; i < input.length()-2; i++){
			if(i % 3 == 0){
				converted[i/3] = (char)(input.charAt(i) + 3);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(char c : converted){
			sb.append(c);			
		}
		output = sb.toString();
		return output;
	}
}
