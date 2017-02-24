package stringMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class StringMath {

	public String convertBases(long num, int base){
		if(base == 2){
			return decimalToBinary(num);
		}
		
		return "";
	}
	
	public String decimalToBinary(long num){
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
	
	public String decimalToOctal(long num){
		long startingPower = 0;
		int power = 0;
		String convertedOctal = "";
		
		for(int x = 0; startingPower < num; x++){
			startingPower = (long)Math.pow(8, x);
			power = x - 1;
		}
		
		while((long)Math.pow(8, power) > 1){
			
			long octal = num / (long)Math.pow(8, power);
			num = num - (octal * (long)Math.pow(8, power));
			convertedOctal += Long.valueOf(octal);
			power--;
		}
		
		
		return convertedOctal;
	}
	
	public double physicsUnits(double num, String unit){
		return 0.0;
	}
	
	public double mathUnits(double num, String unit){
		return 0.0;
	}
	
	public double orderOfOperations(String equation){
		return 0.0;
	}
	
	/*
	 * GUI Geometry and GUI Graphing to be added later if GUI's are figured out.
	 * If unable to figure out GUI's, something else will be figured out.
	 */
}
