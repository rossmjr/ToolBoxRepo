package stringMath;

public class UnitConversions {

	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertMeter(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("kilometer")){
			convertedUnit = num / 1000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("centimeter")){
			convertedUnit = num * 100;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("millimeter")){
			convertedUnit = num * 1000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("mile")){
			convertedUnit = num / 1609.344;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("yard")){
			convertedUnit = num * 1.0936132983377;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("feet")){
			convertedUnit = num * 3.280839895;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("inch")){
			convertedUnit = num * 39.37007874;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("meter")){
			return answer += Double.valueOf(num);
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertCentimeter(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("meter")){
			convertedUnit = num / 100;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("kilometer")){
			convertedUnit = num / 100000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("millimeter")){
			convertedUnit = num * 10;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("mile")){
			convertedUnit = num / 160935;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("yard")){
			convertedUnit = num / 91.44;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("feet")){
			convertedUnit = num / 30.48;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("inch")){
			convertedUnit = num / 2.54;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("centimeter")){
			return answer += Double.valueOf(num);
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertKilometer(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("meter")){
			convertedUnit = num * 1000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("centimeter")){
			convertedUnit = num * 100000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("millimeter")){
			convertedUnit = num * 1000000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("mile")){
			convertedUnit = num / 1.60935;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("yard")){
			convertedUnit = num * 1093.6132983;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("feet")){
			convertedUnit = num * 3280.839895;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("inch")){
			convertedUnit = num * 39370.07874;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("kilometer")){
			return answer += Double.valueOf(num);
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertMillimeter(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("meter")){
			convertedUnit = num / 1000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("centimeter")){
			convertedUnit = num / 10;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("kilometer")){
			convertedUnit = num / 1000000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("mile")){
			convertedUnit = num / 1609350;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("yard")){
			convertedUnit = num / 914.4;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("feet")){
			convertedUnit = num / 304.8;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("inch")){
			convertedUnit = num / 25.4;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("millimeter")){
			return answer += Double.valueOf(num);
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertMile(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("meter")){
			convertedUnit = num * 1609.35;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("centimeter")){
			convertedUnit = num * 160935;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("kilometer")){
			convertedUnit = num * 1.60935;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("millimeter")){
			convertedUnit = num * 1609350;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("yard")){
			convertedUnit = num * 1760.0065617;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("feet")){
			convertedUnit = num * 5280.019685;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("inch")){
			convertedUnit = num * 63360.23622;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("mile")){
			return answer += Double.valueOf(num);
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertYard(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("meter")){
			convertedUnit = num / 1.0936132983;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("centimeter")){
			convertedUnit = num * 91.44;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("kilometer")){
			convertedUnit = num / 1093.6132983;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("millimeter")){
			convertedUnit = num * 914.4;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("mile")){
			convertedUnit = num / 1760.0065617;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("feet")){
			convertedUnit = num * 3;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("inch")){
			convertedUnit = num * 36;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("yard")){
			return answer += Double.valueOf(num);
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertFoot(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("meter")){
			convertedUnit = num / 3.280839895;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("centimeter")){
			convertedUnit = num * 30.48;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("kilometer")){
			convertedUnit = num / 3280.839895;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("millimeter")){
			convertedUnit = num * 304.8;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("mile")){
			convertedUnit = num / 5280.019685;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("yard")){
			convertedUnit = num / 3;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("inch")){
			convertedUnit = num * 12;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("feet")){
			return answer += Double.valueOf(num);
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertInch(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("meter")){
			convertedUnit = num / 39.37007874;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("centimeter")){
			convertedUnit = num * 2.54;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("kilometer")){
			convertedUnit = num / 39370.07874;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("millimeter")){
			convertedUnit = num * 25.4;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("mile")){
			convertedUnit = num / 63360.23622;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("yard")){
			convertedUnit = num / 36;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("feet")){
			convertedUnit = num / 12;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("inch")){
			return answer += Double.valueOf(num);
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param temp - A String of the temperature the "num" will be converted into.
	 * This must be the full name of the temperature.
	 * @return  The "num" in the desired temperature as a String.
	 */
	
	public static String convertFahrenheit(double num, String temp){
		double convertedTemp = 0;
		String answer = "";
		
		if(temp.equalsIgnoreCase("kelvin")){
			convertedTemp = (((num - 32) * ((double)5/(double)9)) + 273.15);
			answer += Double.valueOf(convertedTemp);
			return answer;
		}
		
		if(temp.equalsIgnoreCase("celsius")){
			convertedTemp = ((num - 32) * ((double)5/(double)9));
			answer += Double.valueOf(convertedTemp);
			return answer;
		}
		
		if(temp.equalsIgnoreCase("fahrenheit")){	
			return answer += Double.valueOf(num);
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param temp - A String of the temperature the "num" will be converted into.
	 * This must be the full name of the temperature.
	 * @return  The "num" in the desired temperature as a String.
	 */
	
	public static String convertCelsius(double num, String temp){
		double convertedTemp = 0;
		String answer = "";
		
		if(temp.equalsIgnoreCase("kelvin")){
			convertedTemp = num + 273.15;
			answer += Double.valueOf(convertedTemp);
			return answer;
		}
		
		if(temp.equalsIgnoreCase("fahrenheit")){
			convertedTemp = (num * ((double)9/(double)5)) + 32;
			answer += Double.valueOf(convertedTemp);
			return answer;
		}
		
		if(temp.equalsIgnoreCase("celsius")){
			return answer += Double.valueOf(num);
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param temp - A String of the temperature the "num" will be converted into.
	 * This must be the full name of the temperature.
	 * @return  The "num" in the desired temperature as a String.
	 */
	
	public static String convertKelvin(double num, String temp){
		double convertedTemp = 0;
		String answer = "";
		
		if(temp.equalsIgnoreCase("fahrenheit")){
			convertedTemp = (((num - 273.15) * ((double)9/(double)5)) + 32);
			answer += Double.valueOf(convertedTemp);
			return answer;
		}
		
		if(temp.equalsIgnoreCase("celsius")){
			convertedTemp = num - 273.15;
			answer += Double.valueOf(convertedTemp);
			return answer;
		}
		
		if(temp.equalsIgnoreCase("kelvin")){
			return answer += Double.valueOf(num);
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertLiter(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("milliliter")){
			convertedUnit = num * 1000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("gallon")){
			convertedUnit = num / 3.78541;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("quart")){
			convertedUnit = num * 1.0566887074;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("pint")){
			convertedUnit = num * 2.1133774149;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("cup")){
			convertedUnit = num * 4.2267548297;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("fluid Ounce") || unit.equalsIgnoreCase("fluidOunce")){
			convertedUnit = num * 33.814038638;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("table Spoon") || unit.equalsIgnoreCase("tableSpoon")){
			convertedUnit = num * 67.628077276;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("tea Spoon") || unit.equalsIgnoreCase("teaSpoon")){
			convertedUnit = num * 202.88423183;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("liter")){
			answer += Double.valueOf(num);
			return answer;
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertMilliliter(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("liter")){
			convertedUnit = num / 1000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("gallon")){
			convertedUnit = num / 3785.41;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("quart")){
			convertedUnit = num / 946.3525;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("pint")){
			convertedUnit = num / 473.17625;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("cup")){
			convertedUnit = num / 236.588125;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("fluid Ounce") || unit.equalsIgnoreCase("fluidOunce")){
			convertedUnit = num / 29.573515625;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("table Spoon") || unit.equalsIgnoreCase("tableSpoon")){
			convertedUnit = num / 14.786757812;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("tea Spoon") || unit.equalsIgnoreCase("teaSpoon")){
			convertedUnit = num / 4.9289192708;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("milliliter")){
			answer += Double.valueOf(num);
			return answer;
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertGallon(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("liter")){
			convertedUnit = num * 3.78541;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("milliliter")){
			convertedUnit = num * 3785.41;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("quart")){
			convertedUnit = num * 4;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("pint")){
			convertedUnit = num * 8;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("cup")){
			convertedUnit = num * 16;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("fluid Ounce") || unit.equalsIgnoreCase("fluidOunce")){
			convertedUnit = num * 128;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("table Spoon") || unit.equalsIgnoreCase("tableSpoon")){
			convertedUnit = num * 256;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("tea Spoon") || unit.equalsIgnoreCase("teaSpoon")){
			convertedUnit = num * 768;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("gallon")){
			answer += Double.valueOf(num);
			return answer;
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertQuart(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("liter")){
			convertedUnit = num / 1.0566887074;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("milliliter")){
			convertedUnit = num * 946.3525;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("gallon")){
			convertedUnit = num / 4;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("pint")){
			convertedUnit = num * 2;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("cup")){
			convertedUnit = num * 4;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("fluid Ounce") || unit.equalsIgnoreCase("fluidOunce")){
			convertedUnit = num * 32;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("table Spoon") || unit.equalsIgnoreCase("tableSpoon")){
			convertedUnit = num * 64;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("tea Spoon") || unit.equalsIgnoreCase("teaSpoon")){
			convertedUnit = num * 192;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("quart")){
			answer += Double.valueOf(num);
			return answer;
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertPint(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("liter")){
			convertedUnit = num / 2.1133774149;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("milliliter")){
			convertedUnit = num * 473.17625;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("gallon")){
			convertedUnit = num / 8;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("quart")){
			convertedUnit = num / 2;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("cup")){
			convertedUnit = num * 2;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("fluid Ounce") || unit.equalsIgnoreCase("fluidOunce")){
			convertedUnit = num * 16;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("table Spoon") || unit.equalsIgnoreCase("tableSpoon")){
			convertedUnit = num * 32;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("tea Spoon") || unit.equalsIgnoreCase("teaSpoon")){
			convertedUnit = num * 96;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("pint")){
			answer += Double.valueOf(num);
			return answer;
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertCup(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("liter")){
			convertedUnit = num / 4.2267548297;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("milliliter")){
			convertedUnit = num * 236.588125;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("gallon")){
			convertedUnit = num / 16;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("quart")){
			convertedUnit = num / 4;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("pint")){
			convertedUnit = num / 2;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("fluid Ounce") || unit.equalsIgnoreCase("fluidOunce")){
			convertedUnit = num * 8;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("table Spoon") || unit.equalsIgnoreCase("tableSpoon")){
			convertedUnit = num * 16;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("tea Spoon") || unit.equalsIgnoreCase("teaSpoon")){
			convertedUnit = num * 48;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("cup")){
			answer += Double.valueOf(num);
			return answer;
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertFluidOunce(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("liter")){
			convertedUnit = num / 33.814038638;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("milliliter")){
			convertedUnit = num * 29.573515625;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("gallon")){
			convertedUnit = num / 128;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("quart")){
			convertedUnit = num / 32;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("pint")){
			convertedUnit = num / 16;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("cup")){
			convertedUnit = num / 8;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("table Spoon") || unit.equalsIgnoreCase("tableSpoon")){
			convertedUnit = num * 2;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("tea Spoon") || unit.equalsIgnoreCase("teaSpoon")){
			convertedUnit = num * 6;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("fluid ounce") || unit.equalsIgnoreCase("fluidOunce")){
			answer += Double.valueOf(num);
			return answer;
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertTableSpoon(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("liter")){
			convertedUnit = num / 67.628077276;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("milliliter")){
			convertedUnit = num * 14.786757812;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("gallon")){
			convertedUnit = num / 256;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("quart")){
			convertedUnit = num / 64;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("pint")){
			convertedUnit = num / 32;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("cup")){
			convertedUnit = num / 16;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("fluid ounce") || unit.equalsIgnoreCase("fluidOunce")){
			convertedUnit = num / 2;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("tea Spoon") || unit.equalsIgnoreCase("teaSpoon")){
			convertedUnit = num * 3;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("table Spoon") || unit.equalsIgnoreCase("tableSpoon")){
			answer += Double.valueOf(num);
			return answer;
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertTeaSpoon(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("liter")){
			convertedUnit = num / 202.88423183;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("milliliter")){
			convertedUnit = num * 4.9289192708;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("gallon")){
			convertedUnit = num / 768;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("quart")){
			convertedUnit = num / 192;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("pint")){
			convertedUnit = num / 96;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("cup")){
			convertedUnit = num / 48;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("fluid ounce") || unit.equalsIgnoreCase("fluidOunce")){
			convertedUnit = num / 6;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("table Spoon") || unit.equalsIgnoreCase("tableSpoon")){
			convertedUnit = num / 3;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("tea Spoon") || unit.equalsIgnoreCase("teaSpoon")){
			answer += Double.valueOf(num);
			return answer;
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertKilogram(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("gram")){
			convertedUnit = num * 1000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("milligram")){
			convertedUnit = num * 1000000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("pound")){
			convertedUnit = num * 2.2046244202;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("ounce")){
			convertedUnit = num * 35.273990723;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("kilogram")){
			answer += Double.valueOf(num);
			return answer;
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertGram(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("kilogram")){
			convertedUnit = num / 1000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("milligram")){
			convertedUnit = num * 1000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("pound")){
			convertedUnit = num / 453.592;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("ounce")){
			convertedUnit = num / 28.3495;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("gram")){
			answer += Double.valueOf(num);
			return answer;
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertMilligram(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("kilogram")){
			convertedUnit = num / 1000000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("gram")){
			convertedUnit = num / 1000;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("pound")){
			convertedUnit = num / 453592;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("ounce")){
			convertedUnit = num / 28349.5;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("milligram")){
			answer += Double.valueOf(num);
			return answer;
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertPound(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("kilogram")){
			convertedUnit = num / 2.2046244202;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("gram")){
			convertedUnit = num * 453.592;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("milligram")){
			convertedUnit = num * 453592;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("ounce")){
			convertedUnit = num * 16;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("pound")){
			answer += Double.valueOf(num);
			return answer;
		}
		
		return answer;
	}
	
	/**
	 * @param num - The double that will be converted. This must be a whole number.
	 * @param unit - A String of the unit the "num" will be converted into.
	 * This must be the full name of the unit.
	 * @return  The "num" in the desired unit as a String.
	 */
	
	public static String convertOunce(double num, String unit){
		double convertedUnit = 0;
		String answer = "";
		
		if(unit.equalsIgnoreCase("kilogram")){
			convertedUnit = num / 35.273990723;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("gram")){
			convertedUnit = num * 28.3495;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("milligram")){
			convertedUnit = num * 28349.5;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("pound")){
			convertedUnit = num / 16;
			answer += Double.valueOf(convertedUnit);
			return answer;
		}
		
		if(unit.equalsIgnoreCase("ounce")){
			answer += Double.valueOf(num);
			return answer;
		}
		
		return answer;
	}
}
