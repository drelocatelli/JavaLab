package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerts {
	public Alerts(String header, String content, String type) {
		
		Alert alert = null;
	
		if(type.equals("error")) {
			alert = new Alert(AlertType.ERROR);
//			alert.setTitle("Erro");
			alert.setTitle(null);
		}else if(type.equals("warning")) {
			alert = new Alert(AlertType.WARNING);
//			alert.setTitle("Atenção");
			alert.setTitle(null);
		}else if(type.equals("confirm")) {
			alert = new Alert(AlertType.CONFIRMATION);
//			alert.setTitle("Confirmar");
			alert.setTitle(null);

		}else if(type.equals("info")) {
			alert = new Alert(AlertType.INFORMATION);
//			alert.setTitle("Informação");
			alert.setTitle(null);

		}
		
		alert.setHeaderText(header);
		alert.setContentText(content);
		alert.show();
	}
}