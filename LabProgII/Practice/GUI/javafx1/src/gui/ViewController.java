package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button btTest;
	
	public void onBtTestAction() {
		new Alerts("Atenção!", "Falei pra não clicar!!", "warning");
	}
	
}
