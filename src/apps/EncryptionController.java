package apps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

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
			} else if(RKVKey.getText() != null && RKVKey.getText().isEmpty()){
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

}
