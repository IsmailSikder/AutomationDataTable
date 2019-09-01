package helper_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SetDriver {
	public static WebDriver webdriver;
	
	@Before
	public void get_Browser(){
		System.out.println("Before test....");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
	}
	@After
	public void AfterTest(){
		System.out.println("after test....");
		webdriver.quit();
		
	}

}
