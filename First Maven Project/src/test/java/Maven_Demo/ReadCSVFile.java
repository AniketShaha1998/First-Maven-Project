package Maven_Demo;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.testng.annotations.AfterTest;

public class ReadCSVFile {
	List<String[]> data;
  @Test
  public void f() {
	  int len = data.get(0).length;
		for(int i = 0; i < data.size();i++) {
			for(int j = 0; j <len; j++) {
				String[] col = data.get(i);
				System.out.print(col[j] +" ");
			}
			System.out.println();
		}
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  CSVReader csv = new CSVReader(new FileReader("C:\\Users\\Aniket Ashok Shaha\\PycharmProjects\\Project\\venv\\Lib\\site-packages\\sklearn\\datasets\\data\\iris.csv"));
		data = csv.readAll();
  }

  @AfterTest
  public void afterTest() {
  }

}
