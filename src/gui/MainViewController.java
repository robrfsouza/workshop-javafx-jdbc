package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDepartment;
	@FXML
	private MenuItem menuItemAbout;
	
	
	//implement methods
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("Clicou no vendedor");
	}
	
	@FXML
	public void onMenuItemDepartmentAction() {
		System.out.println("Clicou no departamento");
	}

	@FXML
	public void onMenuItemAboutAction() {
		System.out.println("Clicou no about");
	}

	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
// end
}
