package Maven_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRunner {
	WebDriver driver;
	@Test
	public void f() {
	KeyWords key=new KeyWords(driver);
	key.getUrl("https://blazedemo.com");
	key.selectFromDropDown("name","fromPort","Portland");
	key.selectFromDropDown("name", "toPort", "Rome");
	key.click("css", "input[value='Find Flights']");
	}
	@BeforeTest
	public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "D:\\setup\\selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
	}

}
