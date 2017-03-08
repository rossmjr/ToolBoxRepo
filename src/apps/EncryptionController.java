package apps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

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
			String s = BCBox.getValue();
			if (s.equals("Binary")) {
				BCOutput.setText(stringMath.BaseConversion.convertBases(Long.parseLong(BCInput.getText()), 2).toString());
			} else if (BCBox.getValue().equals("Octal")) {
				BCOutput.setText(stringMath.BaseConversion.convertBases(Long.parseLong(BCInput.getText()), 8).toString());
			} else if (BCBox.getValue().equals("Hexadecimal")) {
				BCOutput.setText(stringMath.BaseConversion.convertBases(Long.parseLong(BCInput.getText()), 16).toString());
			}
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
			if (CLInBox.getValue().equals("Meter")) {
				CLOutput.setText(stringMath.UnitConversions.convertMeter(Double.parseDouble(CLInput.getText()),
						CLOutBox.getValue()));
			} else if (CLInBox.getValue().equals("Kilometer")) {
				CLOutput.setText(stringMath.UnitConversions.convertKilometer(Double.parseDouble(CLInput.getText()),
						CLOutBox.getValue()));
			} else if (CLInBox.getValue().equals("Centimeter")) {
				CLOutput.setText(stringMath.UnitConversions.convertCentimeter(Double.parseDouble(CLInput.getText()),
						CLOutBox.getValue()));
			} else if (CLInBox.getValue().equals("Millimeter")) {
				CLOutput.setText(stringMath.UnitConversions.convertMillimeter(Double.parseDouble(CLInput.getText()),
						CLOutBox.getValue()));
			} else if (CLInBox.getValue().equals("Mile")) {
				CLOutput.setText(stringMath.UnitConversions.convertMile(Double.parseDouble(CLInput.getText()),
						CLOutBox.getValue()).toString());
			} else if (CLInBox.getValue().equals("Yard")) {
				CLOutput.setText(stringMath.UnitConversions.convertYard(Double.parseDouble(CLInput.getText()),
						CLOutBox.getValue()));
			} else if (CLInBox.getValue().equals("Feet")) {
				CLOutput.setText(stringMath.UnitConversions.convertFoot(Double.parseDouble(CLInput.getText()),
						CLOutBox.getValue()));
			} else if (CLInBox.getValue().equals("Inch")) {
				CLOutput.setText(stringMath.UnitConversions.convertInch(Double.parseDouble(CLInput.getText()),
						CLOutBox.getValue()));
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
			if (CTInBox.getValue().equals("Fahrenheit")) {
				CTOutput.setText(stringMath.UnitConversions.convertFahrenheit(Double.parseDouble(CTInput.getText()),
						CTOutBox.getValue()));
			} else if (CTInBox.getValue().equals("Celsius")) {
				CTOutput.setText(stringMath.UnitConversions.convertCelsius(Double.parseDouble(CTInput.getText()),
						CTOutBox.getValue()));
			} else if (CTInBox.getValue().equals("Kelvin")) {
				CTOutput.setText(stringMath.UnitConversions.convertKelvin(Double.parseDouble(CTInput.getText()),
						CTOutBox.getValue()));
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
			if (CVInBox.getValue().equals("Liter")) {
				CVOutput.setText(stringMath.UnitConversions.convertLiter(Double.parseDouble(CVInput.getText()),
						CVOutBox.getValue()));
			} else if (CVInBox.getValue().equals("Millileter")) {
				CVOutput.setText(stringMath.UnitConversions.convertMilliliter(Double.parseDouble(CVInput.getText()),
						CVOutBox.getValue()));
			} else if (CVInBox.getValue().equals("Gallon")) {
				CVOutput.setText(stringMath.UnitConversions.convertGallon(Double.parseDouble(CVInput.getText()),
						CVOutBox.getValue()));
			} else if (CVInBox.getValue().equals("Quart")) {
				CVOutput.setText(stringMath.UnitConversions.convertQuart(Double.parseDouble(CVInput.getText()),
						CVOutBox.getValue()));
			} else if (CVInBox.getValue().equals("Pint")) {
				CVOutput.setText(stringMath.UnitConversions.convertPint(Double.parseDouble(CVInput.getText()),
						CVOutBox.getValue()));
			} else if (CVInBox.getValue().equals("Cup")) {
				CVOutput.setText(stringMath.UnitConversions.convertCup(Double.parseDouble(CVInput.getText()),
						CVOutBox.getValue()));
			} else if (CVInBox.getValue().equals("Fluid Ounce")) {
				CVOutput.setText(stringMath.UnitConversions.convertFluidOunce(Double.parseDouble(CVInput.getText()),
						CVOutBox.getValue()));
			} else if (CVInBox.getValue().equals("Table Spoon")) {
				CVOutput.setText(stringMath.UnitConversions.convertTableSpoon(Double.parseDouble(CVInput.getText()),
						CVOutBox.getValue()));
			} else if (CVInBox.getValue().equals("Tea Spoon")) {
				CVOutput.setText(stringMath.UnitConversions.convertTeaSpoon(Double.parseDouble(CVInput.getText()),
						CVOutBox.getValue()));
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
			if (CWInBox.getValue().equals("Kilogram")) {
				CWOutput.setText(stringMath.UnitConversions.convertKilogram(Double.parseDouble(CWInput.getText()),
						CWOutBox.getValue()));
			} else if (CWInBox.getValue().equals("Gram")) {
				CWOutput.setText(stringMath.UnitConversions.convertGram(Double.parseDouble(CWInput.getText()),
						CWOutBox.getValue()));
			} else if (CWInBox.getValue().equals("Milligram")) {
				CWOutput.setText(stringMath.UnitConversions.convertMilligram(Double.parseDouble(CWInput.getText()),
						CWOutBox.getValue()));
			} else if (CWInBox.getValue().equals("Pound")) {
				CWOutput.setText(stringMath.UnitConversions.convertPound(Double.parseDouble(CWInput.getText()),
						CWOutBox.getValue()));
			} else if (CWInBox.getValue().equals("Ounce")) {
				CWOutput.setText(stringMath.UnitConversions.convertOunce(Double.parseDouble(CWInput.getText()),
						CWOutBox.getValue()));
			} 
		}
	}

}
