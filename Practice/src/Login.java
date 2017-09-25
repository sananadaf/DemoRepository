

import java.net.URI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class Login {

	
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver","C:\\Program Files\\Internet Explorer\\iexplore.exe");
		URI url = new URI("https://www.google.com");
		java.awt.Desktop.getDesktop().browse(url);
		
		System.out.println("hi123");
		
		//WebDriver driver = new InternetExplorerDriver();
		//String url = "https://www.google.com";
		//driver.get(url);
		
		//driver.manage().window().maximize();
		
		
		
	}

	
	
}
	
