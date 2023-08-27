package Com.BestBuy.Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.BestBuy.Demo.BestBuyLogin;
import Com.BestBuy.Demo.BestBuySignUp;
import Com.BestBuyDriverPackage.BestBuyDriverClass;

public class BBLoginTest extends BestBuyDriverClass{
	 WebDriver driver;
	 BestBuyLogin BBL;
		//WebDriverWait wait ;
	
		@BeforeTest
		public void beforeTest() {
			driver=DriverMethod();
		}
		@DataProvider(name="LoginPage")
		public Object[][] getLoginData() throws IOException{
				FileInputStream file=new FileInputStream("F:\\java eclipse\\BestBuy\\data\\BestBuyExcel.xlsx");
		        Workbook workbook=WorkbookFactory.create(file);
		        Sheet sheet=workbook.getSheet("validlogin");
		        int rowcount=sheet.getLastRowNum();
		    	int columnCount=sheet.getRow(0).getLastCellNum();
		    	
		    	Object [][] data=new Object[rowcount][columnCount];
		    	for(int i=0;i<rowcount;i++) {
		    		Row row=sheet.getRow(i+1);
		    	for(int j=0;j<columnCount;j++) {
		    		Cell cell=row.getCell(j);
		    		data[i][j]=cell.toString();
		    	}}
		    workbook.close();
		    	return data;
		    	
			}
		 @Test(dataProvider = "LoginPage")
		  public void BBValidLoginTest(String email,String password) throws InterruptedException {
			
			BBL=new  BestBuyLogin(driver);
			BBL.USclick();
			Thread.sleep(3000);
			BBL.Accountclick();
			Thread.sleep(3000);
			BBL.LoginButton();
			BBL.EnterLoginEmailAdrress(email);
			BBL.EnterLoginPassWordAddress(password);
			BBL.LoginClickButton();
			
}
		 @AfterTest
		  public void aftermethod() throws InterruptedException {
			  Thread.sleep(3000);
			  driver.close();
		  }
}