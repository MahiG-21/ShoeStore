package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {


	 public Properties prop;
		public  WebDriver driver;	
 	public WebDriver initilizrDriver() throws IOException  {
		 prop = new Properties();
		 FileInputStream fis = new FileInputStream("C:\\Users\\mahim\\OneDrive\\Desktop\\New folder\\ShoeStore\\src\\main\\java\\base\\utility.Properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		System.out.println("browsername");
		if(browsername.contains("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mahim\\OneDrive\\Desktop\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver(); 
	
}
		return driver;
}}