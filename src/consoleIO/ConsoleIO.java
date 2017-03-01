package consoleIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleIO {
	//PRO TIP: Make sure to create a new BufferedReader in each method
		//where a BufferedReader is required. Do NOT close the reader as that will cause
		//other issues. Also, catch ALL IOExceptions and NumberFormatExceptions.
		//Do not simply mark the method with a "throws" statement

		/**
		 * Generates a console-based menu using the Strings in options as the menu items.
		 * Reserves the number 0 for the "quit" option when withQuit is true.
		 * @param options - Strings representing the menu options
		 * @param withQuit - adds option 0 for "quit" when true
		 * @return the int of the selection made by the user
		 */
		public static int promptForMenuSelection(String[] options, boolean withQuit){
			boolean valid;
			BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
			int input =0;
			do{
				for (int i = 0; i <options.length; i ++){
					System.out.println(i+1+") "+ options[i]);		
				}if (withQuit){
					System.out.println("0) Exit");
				}
				try{
					String userInput = readRacer.readLine();
					input = Integer.parseInt(userInput);
					if(input == 0 && withQuit){
						valid = true;
					}else if(input >= 1 && input < options.length+1){
						valid = true;
					}else{
						System.out.println("That is not a valid input pleas try again.");
						valid = false;
					}

				}catch(IOException |NumberFormatException exc){
					System.out.println("That is not a valid input, please try again");
					valid = false;
				}
			}while(!valid);
			return input;
		}

		/**
		 * Generates a prompt that expects the user to enter one of two responses that will equate
		 * to a boolean value. The trueString represents the case insensitive response that will equate to true. 
		 * The falseString acts similarly, but for a false boolean value.
		 * 		Example: Assume this method is called with a trueString argument of "yes" and a falseString argument of
		 * 		"no". If the enters "YES", the method returns true. If the user enters "no", the method returns false.
		 * 		All other inputs are considered invalid, the user will be informed, and the prompt will repeat.
		 * @param prompt - the prompt to be displayed to the user
		 * @param trueString - the case insensitive value that will evaluate to true
		 * @param falseString - the case insensitive value that will evaluate to false
		 * @return the boolean value
		 */
		public static boolean promptForBool(String prompt, String trueString, String falseString){
			boolean valid;
			BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
			boolean input = false;
			do{
				System.out.println(prompt);
				try{
					String userInput = readRacer.readLine();
					if (userInput.equalsIgnoreCase(trueString)){
						input = true;
						valid = true;
					}else if (userInput.equalsIgnoreCase(falseString)){
						input = false;
						valid = true;
					}else{
						System.out.println("That is not valid input");
						valid = false;
					}
				}catch(IOException|NumberFormatException exc){
					System.out.println("That is not valid input");
					valid = false;
				}
			}while (!valid);
			return input;
		}

		/**
		 * Generates a prompt that expects a numeric input representing a byte value.
		 * This method loops until valid input is given.
		 * @param prompt - the prompt to be displayed to the user
		 * @param min - the inclusive minimum boundary
		 * @param max - the inclusive maximum boundary
		 * @return the byte value
		 */
		public static byte promptForByte(String prompt, byte min, byte max){
			boolean valid;
			BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
			byte input =0;
			do{
				System.out.println(prompt);
				try{
					String userInput = readRacer.readLine();
					input = Byte.parseByte(userInput);
					if (input >= min && input <= max){
						valid = true;
					}else{
						System.out.println("That is not valid input");
						valid = false;
					}
				}catch(IOException|NumberFormatException exc){
					System.out.println("That is not a valid Input");
					valid = false;
				}


			}while(!valid);
			return input;
		}

		/**
		 * Generates a prompt that expects a numeric input representing a short value.
		 * This method loops until valid input is given.
		 * @param prompt - the prompt to be displayed to the user
		 * @param min - the inclusive minimum boundary
		 * @param max - the inclusive maximum boundary
		 * @return the short value
		 */
		public static short promptForShort(String prompt, short min, short max){
				boolean valid;
				BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
				short input =0;
				do{
					System.out.println(prompt);
					try{
						String userInput = readRacer.readLine();
						input = Short.parseShort(userInput);
						if (input >= min && input <= max){
							valid = true;
						}else{
							System.out.println("That is not valid input");
							valid = false;
						}
					}catch(IOException|NumberFormatException exc){
						System.out.println("That is not a valid Input");
						valid = false;
					}


				}while(!valid);
				return input;
		}

		/**
		 * Generates a prompt that expects a numeric input representing an int value.
		 * This method loops until valid input is given.
		 * @param prompt - the prompt to be displayed to the user
		 * @param min - the inclusive minimum boundary
		 * @param max - the inclusive maximum boundary
		 * @return the int value
		 */
		public static int promptForInt(String prompt, int min, int max){
			boolean valid;
			BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
			int input =0;
			do{
				System.out.println(prompt);
				try{
					String userInput = readRacer.readLine();
					input =Integer.parseInt(userInput);
					if (input >= min && input <= max){
						valid = true;
					}else{
						System.out.println("That is not valid input");
						valid = false;
					}
				}catch(IOException|NumberFormatException exc){
					System.out.println("That is not a valid Input");
					valid = false;
				}


			}while(!valid);
			return input;
		}

		/**
		 * Generates a prompt that expects a numeric input representing a long value.
		 * This method loops until valid input is given.
		 * @param prompt - the prompt to be displayed to the user
		 * @param min - the inclusive minimum boundary
		 * @param max - the inclusive maximum boundary
		 * @return the long value
		 */
		public static long promptForLong(String prompt, long min, long max){
			boolean valid;
			BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
			long input =0;
			do{
				System.out.println(prompt);
				try{
					String userInput = readRacer.readLine();
					input =Long.parseLong(userInput);
					if (input >= min && input <= max){
						valid = true;
					}else{
						System.out.println("That is not valid input");
						valid = false;
					}
				}catch(IOException|NumberFormatException exc){
					System.out.println("That is not a valid Input");
					valid = false;
				}


			}while(!valid);
			return input;
		}

		/**
		 * Generates a prompt that expects a numeric input representing a float value.
		 * This method loops until valid input is given.
		 * @param prompt - the prompt to be displayed to the user
		 * @param min - the inclusive minimum boundary
		 * @param max - the inclusive maximum boundary
		 * @return the float value
		 */
		public static float promptForFloat(String prompt, float min, float max){
			boolean valid;
			BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
			float input =0;
			do{
				System.out.println(prompt);
				try{
					String userInput = readRacer.readLine();
					input =Float.parseFloat(userInput);
					if (input >= min && input <= max){
						valid = true;
					}else{
						System.out.println("That is not valid input");
						valid = false;
					}
				}catch(IOException|NumberFormatException exc){
					System.out.println("That is not a valid Input");
					valid = false;
				}


			}while(!valid);
			return input;
		}

		/**
		 * Generates a prompt that expects a numeric input representing a double value.
		 * This method loops until valid input is given.
		 * @param prompt - the prompt to be displayed to the user
		 * @param min - the inclusive minimum boundary
		 * @param max - the inclusive maximum boundary
		 * @return the double value
		 */
		public static double promptForDouble(String prompt, double min, double max){
			boolean valid;
			BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
			double input =0;
			do{
				System.out.println(prompt);
				try{
					String userInput = readRacer.readLine();
					input =Double.parseDouble(userInput);
					if (input >= min && input <= max){
						valid = true;
					}else{
						System.out.println("That is not valid input");
						valid = false;
					}
				}catch(IOException|NumberFormatException exc){
					System.out.println("That is not a valid Input");
					valid = false;
				}


			}while(!valid);
			return input;
		}

		/**
		 * Generates a prompt that allows the user to enter any response and returns the String.
		 * When allowEmpty is true, empty responses are valid. When false, responses must contain
		 * at least one character (including whitespace).
		 * @param prompt - the prompt to be displayed to the user.
		 * @param allowEmpty - when true, makes empty responses valid
		 * @return the input from the user as a String
		 */
		public static String promptForInput(String prompt, boolean allowEmpty){
			boolean valid;
			BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
			String input =null;
			do{
				System.out.println(prompt);
				try{
					input = readRacer.readLine();
					if(input.equals("") && allowEmpty){
						valid = true;
					}else if (input.equals("")){
						System.out.println("That is not a valid Input");
						valid = false;
					}else{
						valid = true;
					}
				}catch(IOException|NumberFormatException exc){
					System.out.println("That is not a valid Input");
					valid = false;
				}


			}while(!valid);
			return input;
		}

		/**
		 * Generates a prompt that expects a single character input representing a char value.
		 * This method loops until valid input is given.
		 * @param prompt - the prompt to be displayed to the user
		 * @param min - the inclusive minimum boundary
		 * @param max - the inclusive maximum boundary
		 * @return the char value
		 */
		public static char promptForChar(String prompt, char min, char max){
			boolean valid;
			BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
			char[] userInput = {' '};
			char input = ' ';
			do{
				System.out.println(prompt);
				try{
					userInput = (readRacer.readLine()).toCharArray();
					if(userInput.length > 1 && userInput.length <1){
						valid = true;
					}else{
						valid = true;
					}
				}catch(IOException|NumberFormatException exc){
					System.out.println("That is not a valid Input");
					valid = false;
				}

				input = userInput[0];
				 if(input >= min && input <= max){
					 valid = true;
				 }else{
					 System.out.println("That is not a valid Input");
					 valid = false;
				 }
			}while(!valid);
			return input;
		}

}
