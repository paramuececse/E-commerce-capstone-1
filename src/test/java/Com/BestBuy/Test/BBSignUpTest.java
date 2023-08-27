package Com.BestBuy.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.BestBuy.Demo.BestBuySignUp;
import Com.BestBuyDriverPackage.BestBuyDriverClass;

public class BBSignUpTest extends BestBuyDriverClass{
	 WebDriver driver;
	BestBuySignUp BBS;
	WebDriverWait wait ;
	@BeforeTest
	public void beforeTest() {
		driver=DriverMethod();
	}
	
	@DataProvider(name="BBsignUp")
	public Object[][] getLoginData() throws IOException{
			FileInputStream file=new FileInputStream("F:\\java eclipse\\BestBuy\\data\\BestBuyExcel.xlsx");
	        Workbook workbook=WorkbookFactory.create(file);
	        Sheet sheet=workbook.getSheet("signup");
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
  @Test(dataProvider = "BBsignUp")
  public void BBST(String firstname,String lastname,String email,String password,String confirmpassword,String phonenumber) throws InterruptedException {
	
	BBS=new  BestBuySignUp(driver);
	BBS.USclick();
	Thread.sleep(3000);
	BBS.Accountclick();
	BBS.CreateAccount();
//	wait= new WebDriverWait(driver, Duration.ofSeconds(5));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Create Account')])[2]")));
//	driver.findElement(By.xpath("(//a[contains(text(),'Create Account')])[2]")).click();
	Thread.sleep(3000);
	//BBS.CreateAccount();
	BBS.FirstName(firstname);
	BBS.LatName(lastname);
	BBS.Email(email);
	Thread.sleep(3000);
	BBS.Password(password);
	BBS.ConfirmPassword(confirmpassword);
	BBS.Phone(phonenumber);
	BBS.CreateAnAccount();
  }
  @AfterTest
  public void aftermethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }
}
