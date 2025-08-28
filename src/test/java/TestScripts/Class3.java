package TestScripts;


import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.Factorial_Webpg;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Class3 extends BaseClass{
	
	
	Factorial_Webpg fa ;
	
	@BeforeMethod
	public void setup() {
		fa =  new Factorial_Webpg(driver);
	}
	
	@DataProvider (name ="integers", parallel = false)
	public Object[] []intdata(){
		return new Object[][] {{4},{5},{6},{7},{8},{9},{10}} ;
		
	}
	
	
	@Test (dataProvider = "integers")
	public void FactorialTestUsingdataProvider(int number)  {
		
		fa.enterInt(number);
		
		fa.clickCal();

		fa.resultPrint(number);

	}
	
	
	@Test 
	public void factorialTestExcel() throws JXLException, IOException   {
		
		
		FileInputStream fs= new FileInputStream("C:\\Users\\prasa\\OneDrive\\Desktop\\JarFolder\\Book1.xls");
		
		Workbook wb =  Workbook.getWorkbook(fs);
		
		Sheet s = wb.getSheet("Sheet4");
		
		int r= s.getRows();
		int c= s.getColumns();
		String numberS="";
		int num = 0;
		// to print data from a column
		for( int i=0; i<r;i++) {
		
			numberS =s.getCell(0, i).getContents();
			
			num = Integer.parseInt(numberS); 
			
			fa.enterInt(num);
			
			fa.clickCal();
			
			fa.resultPrint(num);
		}

	}

}
