package programUtils;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import programUtils.TryParseIntResult;

public class ProgramUtil {
	/**
	 * Typically called by TryParseInt(), takes in a string to be parsed as an int, and returns the value parsed as an int
	 * @throws - NumberFormatException if the String either has characters that aren't numeric(excluding '-' if it is the first character)
	 * or if the value exceeds int max or min.
	 * @param input - String to be parsed to an int.
	 * @return - the resulting int value.
	 */
	public static int parseInt(String input) {
		input = input.trim();
		int i = 0;
		if (input.charAt(0) == 45) {
			i = 1;
		}
		for (; i < input.length(); i++) {
			if (input.charAt(i) < 48 || input.charAt(i) > 57) {
				throw new NumberFormatException(
						"The input " + input + " is either not a number or contains special characters.");
			}
		}
		int k = 0;
		if (input.charAt(0) == 45) {
			k = 1;
		}
		boolean valid = true;
		if ((input.length() == 11 && k == 1) || (input.length() == 10 && k == 0)) {
			int j = k;
			if (input.charAt(j) > 50) {
				valid = false;
			} else if (input.charAt(j) == 50) {
				if (input.charAt(j + 1) > 49) {
					valid = false;
				} else if (input.charAt(j + 1) == 49) {
					if (input.charAt(j + 2) > 52) {
						valid = false;
					} else if (input.charAt(j + 2) == 52) {
						if (input.charAt(j + 3) > 55) {
							valid = false;
						} else if (input.charAt(j + 3) == 55) {
							if (input.charAt(j + 4) > 52) {
								valid = false;
							} else if (input.charAt(j + 4) == 52) {
								if (input.charAt(j + 5) > 56) {
									valid = false;
								} else if (input.charAt(j + 5) == 56) {
									if (input.charAt(j + 6) > 51) {
										valid = false;
									} else if (input.charAt(j + 6) == 51) {
										if (input.charAt(j + 7) > 54) {
											valid = false;
										} else if (input.charAt(j + 7) == 54) {
											if (input.charAt(j + 8) > 52) {
												valid = false;
											} else if (input.charAt(j + 8) == 52) {
												if (input.charAt(j + 9) > 55) {
													valid = false;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} else if ((input.length() >= 11 && k == 1) || (input.length() >= 10 && k == 0)) {
			valid = false;
		}
		if (!valid) {
			throw new NumberFormatException("Exceeds int Max or Min");
		}
		int value = 0;
		int num = 0;
		boolean negative = false;
		i = 0;
		if (input.charAt(0) == '-') {
			negative = true;
			i = 1;
		}
		while (i < input.length()) {
			num *= 10;
			num += input.charAt(i++) - '0';
		}
		if (negative) {
			num = -num;
		}
		value = num;
		return value;
	}

	/**
	 * Used to attempt to parse an Int to a string, returns a TryParseIntResult object, which has a boolean value of didParse, and 
	 * result value of the resulting int.
	 * @param input - the String to be parsed to an Int.
	 * @return - TryParseIntResult, has boolean didParse, and int result.
	 */
	public static TryParseIntResult tryParseInt(String input) {
		TryParseIntResult tpir;
		input = input.trim();
		boolean parsed;
		try{
			int val = parseInt(input);
			parsed = true;
			tpir = new TryParseIntResult(parsed, val);
		}catch(NumberFormatException nfe){
			parsed = false;
			tpir = new TryParseIntResult(parsed, null);
		}
		return tpir;
	}
	
	/**
	 * Returns the factorial value of the int passed in for values 0-20 as a long.
	 * @param num - int to have the  factorial value calculated
	 * @return - resulting value of the factorial as a long.
	 */
	public static long factorial(int num) {
		if (num < 0 || num > 20) {
			throw new IllegalArgumentException("Input must be between 0 and 31");
		}
		long factorial = num;
		if (num == 0) {
			factorial = 1;
		}
		if (num > 0) {
			factorial *= factorial(--num);
		}
		return factorial;
	}

	/**
	 * Reads a file from the given path to a string.
	 * @param filePath - the location at which to find the file to be read 
	 * @return - the contents of the file as a String.
	 * @throws IOException
	 */
	public static String readFile(String filePath) throws IOException {
		String line = "no file read";
		try {
			line = new String(Files.readAllBytes(Paths.get(filePath)));
		} catch (FileNotFoundException fnfe) {
			System.out.println("No file found for path" + filePath);
		}
		return line;
	}

	/**
	 * Writes the string in the second parameter to the file at the location in the first if the path exists.
	 * If the given path is valid but the file does not exist, it will be created.
	 * If the given path exists and the file does exist it will be overwritten.
	 * If the given path is invalid, it will throw a FileNotFoundException
	 * @param filePath - the relative path to which the data should be written
	 * @param output - the data to be written to the file.
	 * @throws IOException
	 */
	public static void writeToFile(String filePath, String output) throws IOException {
		if (filePath == null) {
			throw new IllegalArgumentException("FilePath was Null");
		}
		if (output == null) {
			throw new IllegalArgumentException("Output was Null");
		}
		try {
			FileWriter fw = new FileWriter(filePath, false);
			PrintWriter pw = new PrintWriter(fw);
			pw.write(output);
			pw.close();
		} catch (FileNotFoundException fnfe) {
			throw new FileNotFoundException("Filepath not found");
		}
	}
}
