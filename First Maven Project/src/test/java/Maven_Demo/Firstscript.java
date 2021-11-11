package Maven_Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Firstscript {
	WebDriver driver;
  @Test
  public void f() {
	  ExtentReports ex = new ExtentReports();
	  ex.attachReporter(new ExtentHtmlReporter("facebook.html"));
	  ExtentTest tc1 = ex.createTest("DropDownExample");
	  tc1.info("Implicit Wait Time");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	  tc1.info("Implicit Wait Time");
	  try {
		  Assert.assertEquals(driver.getTitle(), "Sign up for Facebook | Facebook");
		  tc1.pass("Title Verified");
	  }catch(AssertionError E) {
		  tc1.fail(E.getMessage()); //For Failing Extend Report
		  Assert.fail(E.getMessage()); // For Failing TestNg Report
	}
	  tc1.info("Selecting Day");
	  Select day = new Select(driver.findElement(By.id("day")));
	  day.selectByIndex(8);
	  tc1.info("Selecting Month");
	  Select month = new Select(driver.findElement(By.id("month")));
	  month.selectByValue("11");
	  tc1.info("Selecting Year");
	  Select year = new Select(driver.findElement(By.id("year")));
	  year.selectByVisibleText("1998");
	  tc1.pass("Test Complited successfully");
	  ex.flush();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\setup\\selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	 }

  @AfterTest
  public void afterTest() {
  }

}
