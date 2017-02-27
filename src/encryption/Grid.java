package encryption;

public class Grid {

//	public static void main(String[] args) {
//		System.out.println(encrypt("Sherlock, I am coming for you"));
//		System.out.println(decrypt("Scair hkmn  e, gy r c o lIofu o mo  "));
//	}

	/**
	 * Encrypts the given message using the Grid/Box cipher. Case is not adjusted.
	 * 
	 *
	 * @param message - The message to be encrypted
	 * @return The encrypted message
	 */
	public static String encrypt(String message) {
		String encrypted = "";
		int num = message.length();
		double sqrt = Math.sqrt(num);
		int sqrtRounded = (int) sqrt;
		//If the sqrt isn't a whole number then I add 1 and check again until it is
		while (sqrt > sqrtRounded) {
			num += 1;
			sqrt = Math.sqrt(num);
			sqrtRounded = (int) sqrt;
		}
		//Then I create a 2d array as my grid and populate it with the chars of
			//the message, inputing spaces when the box is longer then the message.
		int charIndex = 0;
		char[][] grid = new char[sqrtRounded][sqrtRounded];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (charIndex < message.length()) {
					grid[i][j] = message.charAt(charIndex++);
//					charIndex++;
				} else {
					grid[i][j] = ' ';
				}
			}
		}
		//Finally, I go through and add each char to the final string
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
					encrypted += grid[j][i];
			}
		}
		return encrypted;
	}

	/**
	 * Decrypts the given message using the Grid/Box cipher. Case is not adjusted.
	 * 
	 *
	 * @param message - The message to be decrypted
	 * @return The decrypted message
	 */
	public static String decrypt(String message) {
		String encrypted = "";
		int num = message.length();
		double sqrt = Math.sqrt(num);
		int sqrtRounded = (int) sqrt;
		//If the sqrt isn't a whole number then I add 1 and check again until it is
		while (sqrt > sqrtRounded) {
			num += 1;
			sqrt = Math.sqrt(num);
			sqrtRounded = (int) sqrt;
		}
		//Then I create a 2d array as my grid and populate it with the chars of
			//the message, inputing spaces when the box is longer then the message.
		int charIndex = 0;
		char[][] grid = new char[sqrtRounded][sqrtRounded];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (charIndex < message.length()) {
					grid[i][j] = message.charAt(charIndex++);
//					charIndex++;
				} else {
					grid[i][j] = ' ';
				}
			}
		}
		//Finally, I go through and add each char to the final string
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
					encrypted += grid[j][i];
			}
		}
		return encrypted;
	}
}
