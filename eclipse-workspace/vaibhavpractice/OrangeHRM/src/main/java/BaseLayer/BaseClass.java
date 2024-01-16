package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public BaseClass() {
		File f = new File(System.getProperty("user.dir")+"//src//main//java//Configuration//Orange.properties");
		
		try {
			FileInputStream fis = new FileInputStream(f);
			 prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public static void initilization() {
			
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		String abc =  prop.getProperty("url");
			driver.get(abc);
			
		}
				
	}
	

