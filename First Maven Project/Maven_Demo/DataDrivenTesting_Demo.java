package Maven_Demo;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting_Demo {

	WebDriver driver;
	XSSFSheet sheet;
	@Test(priority=1,dataProvider = "dp_name")
	public void f(String ekey,String pwd) throws Exception{
		driver.findElement(By.name("txtUsername")).sendKeys(usr);
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		driver.findElement(By.name("Submit")).click();
		if(driver.getCurrentUrl().contains("dashboard")) {
			System.out.println(usr + " " + pwd + "Connected Sucessfully");
			driver.findElement(By.cssSelector("a.panelTrigger")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("a[href ='/index.php/auth/logout']")).click();
		}
		else {
			System.out.println(usr + " " + pwd + " Connection Failed");
		}
		
	}
	
	@DataProvider
	public Object[][] dp_name(){
		int row = 3;
		int col = 2;
		Excel ex = new Excel("C:\\Users\\Aniket Ashok Shaha\\OneDrive\\Desktop\\Book1.xlsx");
		Object data[][] = new Object[row][col];
		/*data[0][0] = "admin";
		data[0][1] = "admin123";
		data[1][0] = "Dummy";
		data[1][1] = "dummy123";
		data[2][0] = "usr";
		data[2][1] = "pwd";*/
		/*for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				data[i][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;*/
		for(int i = 0; i < data.length; i++) {
			data[i][0] = 
		}
	}
	
	@BeforeTest
	public void beforeTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\setup\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
//		XSSFWorkbook book = new XSSFWorkbook(new FileInputStream(""));
//		sheet = book.getSheet("Sheet1");
		
	}
}
