package TestLayerPackage;




import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginTest extends BaseClass{

	@BeforeTest
	public void setup() {
		BaseClass.initilization();
	}
	
	@Test
	public void validateLoginPageFunctionality() {
		LoginPage loginpage = new LoginPage();
		loginpage.LoginPageFunctionality("Admin", "admin123");
	}
	
	
}
