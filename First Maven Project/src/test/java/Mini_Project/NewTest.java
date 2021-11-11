package Mini_Project;

import org.testng.annotations.Test;
import com.opencsv.CSVReader;
import org.testng.annotations.BeforeTest;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static void main(String[] args) throws Exception{
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", "D:\\setup\\selenium\\chromedriver.exe");
//		driver = new ChromeDriver();
		Connection conn = null;
		String[] col = null ;
		CSVReader csv = new CSVReader(new FileReader("C:\\Users\\Aniket Ashok Shaha\\PycharmProjects\\Project\\venv\\Lib\\site-packages\\sklearn\\datasets\\data\\iris.csv"));
		List<String[]> data = csv.readAll();
		int len = data.get(0).length;
		for(int i = 1; i < data.size();i++) {
			for(int j = 0; j <len; j++) {
				col = data.get(i);
				
				
			}
			System.out.print(col[2] +" ");
			System.out.println();
		}
		
		
//
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver"); //name of driver class
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","LTI","223804");
//			while(!data.equals(null) ) {
//				System.out.println(data);
//			}
//			for(int i = 0 ;i < data.size();i++) {
//				String[] row=data.get(i);
//				System.out.println(row[1]);
//			}
//			
//			//ResultSet result = conn.createStatement().executeQuery("create table Mini_Project("
//				//	+ "UserName varchar2(20), Password varchar2(20)");
//					
//			while(result.next()==true) {
//				String un = result.getString("un");
//				String pwd = result.getString("pwd");
//				driver.findElement(By.name("txtUsername")).sendKeys(un);
//				driver.findElement(By.name("txtPassword")).sendKeys(pwd);
//				driver.findElement(By.name("Submit")).click();
//			}
//		}
//		catch(ClassNotFoundException e) {
//			System.out.println("Missing Something");
//		}
//		catch(SQLException e) {
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				conn.close();
//			}
//			catch(Exception e) {
//				
//			}
//		}
//	
  }
}
