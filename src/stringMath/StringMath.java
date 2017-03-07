package stringMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class StringMath {

	/**
	 * @param num - The long that will be converted. This must be a whole number.
	 * @param base - The number base to convert "num" into. This must be a whole number.
	 * @return  The "num" in the given "base" as a String.
	 */
	
	public static String convertBases(long num, int base){
		if(base == 2){
			return decimalToBinary(num);
		}
		
		if(base == 8){
			return decimalToOctal(num);
		}
		
		if(base == 16){
			return decimalToHexadecimal(num);
		}
		
		return "";
	}
	
	private static String decimalToBinary(long num){
		String remainder = "";
		String reversedBinary = "";
		String minus = "";
		
		if(num == 0){
			remainder = "0";
			reversedBinary = "0";
		}
		
		if(num < 0){
			num += (num*(-2));
			minus = "-";
		}
		
		while(num > 0){
			if(num % 2 == 0){
				remainder = "0";
			}else{
				remainder = "1";
			}
			reversedBinary += remainder;
			num/= 2;
		}
		
		String binary = "";
		
		return (minus + (binary = new StringBuffer(reversedBinary).reverse().toString()));
	}
	
	private static String decimalToOctal(long num){
		long maxOctal = 9223372036854775807L;
		if(num > maxOctal){
			System.out.println("The number " + num + " cannot be greater than 9223372036854775807.");
		}
		
		long startingPower = 0;
		int power = 0;
		String convertedOctal = "";
		
		for(int x = 0; startingPower < num; x++){
			startingPower = (long)Math.pow(8, x);
			power = x - 1;
		}
		
		while((long)Math.pow(8, power) > 0){
			
			long octal = num / (long)Math.pow(8, power);
			num = num - (octal * (long)Math.pow(8, power));
			convertedOctal += Long.valueOf(octal);
			power--;
		}
		
		return convertedOctal;
	}
	
	private static String decimalToHexadecimal(double num){
		String reversedHexadecimal = "";
		
		while((int)num > 0){
			num = num / 16;
			int remainder = 0;
			int hexadecimal = (int)((num - (int)num) * 16);
			
			if(hexadecimal == 10){
				reversedHexadecimal += "A";
			}else if(hexadecimal == 11){
				reversedHexadecimal += "B";
			}else if(hexadecimal == 12){
				reversedHexadecimal += "C";
			}else if(hexadecimal == 13){
				reversedHexadecimal += "D";
			}else if(hexadecimal == 14){
				reversedHexadecimal += "E";
			}else if(hexadecimal == 15){
				reversedHexadecimal += "F";
			}else{
				reversedHexadecimal += Integer.valueOf(hexadecimal);
			}
		}
		
		String hexadecimal = new StringBuffer(reversedHexadecimal).reverse().toString();
		
		return hexadecimal;
	}
	
	public int orderOfOperations(String equation){
		String partOfEquation = "";
		
		if(equation.contains("(") || equation.contains(")")){
			partOfEquation = equation.substring(equation.indexOf("("), equation.indexOf(")"));
		}else if(equation.contains("^")){
			
		}else if(equation.contains("*")){
			
		}else if(equation.contains("/")){
			
		}else if(equation.contains("+")){
			
		}else if(equation.contains("-")){
			
		}
		
		return 0;
	}
	
	/*
	 * GUI Geometry and GUI Graphing to be added later if GUI's are figured out.
	 * If unable to figure out GUI's, something else will be figured out.
	 */
}
