package Mini_Project;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class Insert_Value {
	CSVReader csv;
	List<String[]> data ;
	int col,row;
  @Test
  public void f() throws Exception{
	  
		
		int len = 
		
  }
  
  @DataProvider
	public Object[][] dp_name(){
		int row = 3;
		int col = 2;
		Object data[][] = new Object[row][col];
//		data[0][0] = "admin";
//		data[0][1] = "admin123";
//		data[1][0] = "Dummy";
//		data[1][1] = "dummy123";
//		data[2][0] = "usr";
//		data[2][1] = "pwd";
		for(int i = 0; i < row;i++) {
			for(int j = 0; j <col; j++) {
				String[] col1 = data.get(i);
				System.out.print(col[j] +" ");
				for(int k = 0; k < col; k++) {
					data[i][k] = col1[k];
				}
			}
			System.out.println();
		}
		return data;
	}
  @BeforeTest
  public void beforeTest() throws Exception {
	  csv = new CSVReader(new FileReader("C:\\Users\\Aniket Ashok Shaha\\PycharmProjects\\Project\\venv\\Lib\\site-packages\\sklearn\\datasets\\data\\iris.csv"));
	  data = csv.readAll();
	  row = data.size();
	  col = data.get(0).length;
  }
}
