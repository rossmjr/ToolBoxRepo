package apps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import stringMath.Equations;

public class EncryptionController {
	// Encryptions without keys
	@FXML
	private TextField ROutput;
	@FXML
	private TextField RMessage;

	@FXML
	protected void encryptR(ActionEvent event) {
		if (RMessage.getText() != null && !RMessage.getText().isEmpty()) {
			ROutput.setText(encryption.ROT13.encrypt(RMessage.getText()));
		}
	}

	@FXML
	protected void decryptR(ActionEvent event) {
		if (RMessage.getText() != null && !RMessage.getText().isEmpty()) {
			ROutput.setText(encryption.ROT13.decrypt(RMessage.getText()));
		}
	}

	@FXML
	private TextField SOutput;
	@FXML
	private TextField SMessage;

	@FXML
	protected void encryptS(ActionEvent event) {
		if (SMessage.getText() != null && !SMessage.getText().isEmpty()) {
			SOutput.setText(encryption.Sub347.encrypt(SMessage.getText()));
		}

	}

	@FXML
	protected void decryptS(ActionEvent event) {
		if (SMessage.getText() != null && !SMessage.getText().isEmpty()) {
			SOutput.setText(encryption.Sub347.decrypt(SMessage.getText()));
		}

	}

	@FXML
	private TextField GOutput;
	@FXML
	private TextField GMessage;

	@FXML
	protected void encryptG(ActionEvent event) {
		if (GMessage.getText() != null && !GMessage.getText().isEmpty()) {
			GOutput.setText(encryption.Grid.encrypt(GMessage.getText()));
		}

	}

	@FXML
	protected void decryptG(ActionEvent event) {
		if (GMessage.getText() != null && !GMessage.getText().isEmpty()) {
			GOutput.setText(encryption.Grid.decrypt(GMessage.getText()));
		}

	}

	// Encryptions with keys
	@FXML
	private TextField BOutput;
	@FXML
	private TextField BMessage;
	@FXML
	private TextField BKey;

	@FXML
	protected void encryptB(ActionEvent event) {
		if (BMessage.getText() != null && !BMessage.getText().isEmpty()) {
			if (BKey.getText() != null && !BKey.getText().isEmpty()) {
				BOutput.setText(encryption.Beaufort.encrypt(BMessage.getText(), BKey.getText()));
			}
		}
	}

	@FXML
	protected void decryptB(ActionEvent event) {
		if (BMessage.getText() != null && !BMessage.getText().isEmpty()) {
			if (BKey.getText() != null && !BKey.getText().isEmpty()) {
				BOutput.setText(encryption.Beaufort.decrypt(BMessage.getText(), BKey.getText()));
			}
		}
	}

	@FXML
	private TextField RKVOutput;
	@FXML
	private TextField RKVMessage;
	@FXML
	private TextField RKVKey;

	@FXML
	protected void encryptRKV(ActionEvent event) {
		if (RKVMessage.getText() != null && !RKVMessage.getText().isEmpty()) {
			if (RKVKey.getText() != null && !RKVKey.getText().isEmpty()) {
				RKVOutput.setText(encryption.RunningKey.encrypt(RKVMessage.getText(), RKVKey.getText()));
			} else if (RKVKey.getText() != null && RKVKey.getText().isEmpty()) {
				RKVOutput.setText(encryption.RunningKey.encrypt(RKVMessage.getText()));
				RKVKey.setText(encryption.RunningKey.getKey());
			}
		}
	}

	@FXML
	protected void decryptRKV(ActionEvent event) {
		if (RKVMessage.getText() != null && !RKVMessage.getText().isEmpty()) {
			if (RKVKey.getText() != null && !RKVKey.getText().isEmpty()) {
				RKVOutput.setText(encryption.RunningKey.decrypt(RKVMessage.getText(), RKVKey.getText()));
			}
		}
	}

	@FXML
	private TextField XOutput;
	@FXML
	private TextField XMessage;
	@FXML
	private TextField XKey;

	@FXML
	protected void encryptX(ActionEvent event) {
		if (XMessage.getText() != null && !XMessage.getText().isEmpty()) {
			if (XKey.getText() != null && !XKey.getText().isEmpty()) {
				XOutput.setText(encryption.XOR.encrypt(XMessage.getText(), XKey.getText().charAt(0)));
			}
		}
	}

	@FXML
	protected void decryptX(ActionEvent event) {
		if (XMessage.getText() != null && !XMessage.getText().isEmpty()) {
			if (XKey.getText() != null && !XKey.getText().isEmpty()) {
				XOutput.setText(encryption.XOR.decrypt(XMessage.getText(), XKey.getText().charAt(0)));
			}
		}
	}

	//
	//
	// MathController

	@FXML
	private TextField BCOutput;
	@FXML
	private TextField BCInput;
	@FXML
	private ComboBox<String> BCBox;

	@FXML
	protected void BC(ActionEvent event) {
		if (BCInput.getText() != null && !BCInput.getText().isEmpty()) {
			if (BCBox.getValue().equals("Binary")) {
				BCOutput.setText(stringMath.BaseConversion.convertDecimal(Long.parseLong(BCInput.getText()), 2).toString());
			} else if (BCBox.getValue().equals("Octal")) {
				BCOutput.setText(stringMath.BaseConversion.convertDecimal(Long.parseLong(BCInput.getText()), 8).toString());
			} else if (BCBox.getValue().equals("Hexadecimal")) {
				BCOutput.setText(stringMath.BaseConversion.convertDecimal(Long.parseLong(BCInput.getText()), 16).toString());
			}
		}
	}
	
	@FXML
	private TextField SMOutput;
	@FXML
	private TextField SMInput;

	@FXML
	protected void SM(ActionEvent event) {
		if (SMInput.getText() != null && !SMInput.getText().isEmpty()) {
			Equations math = new Equations();
			math.equation(SMInput.getText());
				SMOutput.setText(math.solve());
		}
	}

	@FXML
	private TextField CLOutput;
	@FXML
	private TextField CLInput;
	@FXML
	private ComboBox<String> CLInBox;
	@FXML
	private ComboBox<String> CLOutBox;

	@FXML
	protected void CL(ActionEvent event) {
		if (CLInput.getText() != null && !CLInput.getText().isEmpty()) {
			String[] unit = CLOutBox.getValue().split(" ");
			if (CLInBox.getValue().equals("Meter (m)")) {
				CLOutput.setText(
						stringMath.UnitConversions.convertMeter(Double.parseDouble(CLInput.getText()), unit[0]));
			} else if (CLInBox.getValue().equals("Kilometer (km)")) {
				CLOutput.setText(
						stringMath.UnitConversions.convertKilometer(Double.parseDouble(CLInput.getText()), unit[0]));
			} else if (CLInBox.getValue().equals("Centimeter (cm)")) {
				CLOutput.setText(
						stringMath.UnitConversions.convertCentimeter(Double.parseDouble(CLInput.getText()), unit[0]));
			} else if (CLInBox.getValue().equals("Millimeter (mm)")) {
				CLOutput.setText(
						stringMath.UnitConversions.convertMillimeter(Double.parseDouble(CLInput.getText()), unit[0]));
			} else if (CLInBox.getValue().equals("Mile (mi)")) {
				CLOutput.setText(
						stringMath.UnitConversions.convertMile(Double.parseDouble(CLInput.getText()), unit[0]));
			} else if (CLInBox.getValue().equals("Yard (yd)")) {
				CLOutput.setText(
						stringMath.UnitConversions.convertYard(Double.parseDouble(CLInput.getText()), unit[0]));
			} else if (CLInBox.getValue().equals("Feet (ft)")) {
				CLOutput.setText(
						stringMath.UnitConversions.convertFoot(Double.parseDouble(CLInput.getText()), unit[0]));
			} else if (CLInBox.getValue().equals("Inch (in)")) {
				CLOutput.setText(
						stringMath.UnitConversions.convertInch(Double.parseDouble(CLInput.getText()), unit[0]));
			}
		}
	}

	@FXML
	private TextField CTOutput;
	@FXML
	private TextField CTInput;
	@FXML
	private ComboBox<String> CTInBox;
	@FXML
	private ComboBox<String> CTOutBox;

	@FXML
	protected void CT(ActionEvent event) {
		if (CTInput.getText() != null && !CTInput.getText().isEmpty()) {
			String[] unit = CTOutBox.getValue().split(" ");
			if (CTInBox.getValue().equals("Fahrenheit (F)")) {
				CTOutput.setText(
						stringMath.UnitConversions.convertFahrenheit(Double.parseDouble(CTInput.getText()), unit[0]));
			} else if (CTInBox.getValue().equals("Celsius (C)")) {
				CTOutput.setText(
						stringMath.UnitConversions.convertCelsius(Double.parseDouble(CTInput.getText()), unit[0]));
			} else if (CTInBox.getValue().equals("Kelvin (K)")) {
				CTOutput.setText(
						stringMath.UnitConversions.convertKelvin(Double.parseDouble(CTInput.getText()), unit[0]));
			}
		}
	}

	@FXML
	private TextField CVOutput;
	@FXML
	private TextField CVInput;
	@FXML
	private ComboBox<String> CVInBox;
	@FXML
	private ComboBox<String> CVOutBox;

	@FXML
	protected void CV(ActionEvent event) {
		if (CVInput.getText() != null && !CVInput.getText().isEmpty()) {
			String[] unit = CVOutBox.getValue().split(" \\(");
			if (CVInBox.getValue().equals("Liter (L)")) {
//				String[] unit = CVOutBox.getValue().split(" ");
				CVOutput.setText(stringMath.UnitConversions.convertLiter(Double.parseDouble(CVInput.getText()), unit[0]));
			} else if (CVInBox.getValue().equals("Milliliter (ml)")) {
//				String[] unit = CVOutBox.getValue().split(" ");
				CVOutput.setText(stringMath.UnitConversions.convertMilliliter(Double.parseDouble(CVInput.getText()), unit[0]));
			} else if (CVInBox.getValue().equals("Gallon (gal)")) {
//				String[] unit = CVOutBox.getValue().split(" ");
				CVOutput.setText(stringMath.UnitConversions.convertGallon(Double.parseDouble(CVInput.getText()), unit[0]));
			} else if (CVInBox.getValue().equals("Quart (qt)")) {
//				String[] unit = CVOutBox.getValue().split(" ");
				CVOutput.setText(stringMath.UnitConversions.convertQuart(Double.parseDouble(CVInput.getText()), unit[0]));
			} else if (CVInBox.getValue().equals("Pint (pt)")) {
//				String[] unit = CVOutBox.getValue().split(" ");
				CVOutput.setText(stringMath.UnitConversions.convertPint(Double.parseDouble(CVInput.getText()), unit[0]));
			} else if (CVInBox.getValue().equals("Cup (c)")) {
//				String[] unit = CVOutBox.getValue().split(" ");
				CVOutput.setText(stringMath.UnitConversions.convertCup(Double.parseDouble(CVInput.getText()), unit[0]));
			} else if (CVInBox.getValue().equals("Fluid Ounce (Fl Oz)")) {
//				String[] unit = CVOutBox.getValue().split("(");
				CVOutput.setText(stringMath.UnitConversions.convertFluidOunce(Double.parseDouble(CVInput.getText()), unit[0]));
			} else if (CVInBox.getValue().equals("Tablespoon (tbsp)")) {
//				String[] unit = CVOutBox.getValue().split("(");
				CVOutput.setText(stringMath.UnitConversions.convertTableSpoon(Double.parseDouble(CVInput.getText()), unit[0]));
			} else if (CVInBox.getValue().equals("Teaspoon (tsp)")) {
//				String[] unit = CVOutBox.getValue().split("(");
				CVOutput.setText(stringMath.UnitConversions.convertTeaSpoon(Double.parseDouble(CVInput.getText()), unit[0]));
			}
		}
	}

	@FXML
	private TextField CWOutput;
	@FXML
	private TextField CWInput;
	@FXML
	private ComboBox<String> CWInBox;
	@FXML
	private ComboBox<String> CWOutBox;

	@FXML
	protected void CW(ActionEvent event) {
		if (CWInput.getText() != null && !CWInput.getText().isEmpty()) {
			String[] unit = CWOutBox.getValue().split(" ");
			if (CWInBox.getValue().equals("Kilogram (kg)")) {
				CWOutput.setText(
						stringMath.UnitConversions.convertKilogram(Double.parseDouble(CWInput.getText()), unit[0]));
			} else if (CWInBox.getValue().equals("Gram (g)")) {
				CWOutput.setText(
						stringMath.UnitConversions.convertGram(Double.parseDouble(CWInput.getText()), unit[0]));
			} else if (CWInBox.getValue().equals("Milligram (mg)")) {
				CWOutput.setText(
						stringMath.UnitConversions.convertMilligram(Double.parseDouble(CWInput.getText()), unit[0]));
			} else if (CWInBox.getValue().equals("Pound (lb)")) {
				CWOutput.setText(
						stringMath.UnitConversions.convertPound(Double.parseDouble(CWInput.getText()), unit[0]));
			} else if (CWInBox.getValue().equals("Ounce (oz)")) {
				CWOutput.setText(
						stringMath.UnitConversions.convertOunce(Double.parseDouble(CWInput.getText()), unit[0]));
			}
		}
	}

}
