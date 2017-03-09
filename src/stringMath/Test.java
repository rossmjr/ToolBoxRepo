package stringMath;

public class Test {

	public static void main(String[] args){
		BaseConversion math = new BaseConversion();
		Equations test = new Equations();
		UnitConversions unit = new UnitConversions();
//		System.out.print(math.convertDecimal(590, 16));
//		test.equation("18 - 9 * 4 / ( 3 - 12 ) ^ 5 ^ 2");
		math.convertToDecimal("da12c", 16);
	}
}
