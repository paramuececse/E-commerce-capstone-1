package Com.BestBuy.Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.BestBuy.Demo.AddItemDemo;
import Com.BestBuyDriverPackage.BestBuyDriverClass;

public class AddItemTest extends BestBuyDriverClass{
	public class LinkTest extends BestBuyDriverClass{
		WebDriver driver;
		AddItemDemo ait;
		
		@BeforeTest
		public void BestBuydriverMethod() throws IOException {
			driver=DriverMethod();
			
		}
		
		@DataProvider(name="AddItems")
		public Object[][] getLoginData() throws IOException{
				FileInputStream file=new FileInputStream("F:\\java eclipse\\BestBuy\\data\\BestBuyExcel.xlsx");
		        Workbook workbook=WorkbookFactory.create(file);
		        Sheet sheet=workbook.getSheet("additems");
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
	  @Test(dataProvider = "AddItems")
	  public void AddItemTestMethods(String searchitem,String firstname,String lastname,String email,String city,String zipcode,String emailid,String phonenumber) throws InterruptedException {
		  ait=new AddItemDemo(driver);
		  ait.usmethod();
		  ait.SearchMethod(searchitem);
		  ait.search();
		  ait.checkbox();
		  ait.addcartMethod();
		  ait.addtocart();
		  ait.MenuMethod();
		 // ait.comparemethod();
		  ait.computerclick();
		  ait.TabletsMethod();
		  ait.ipadmethod();
		  ait.ipadpics();
		  ait.cbox();
		  ait.addtocartmethod2();
		  
		  ait.MenuMethod();
		  ait.BrandMethod();
		  ait.BrandSub();
		  ait.product();
		  ait.addtocart3method();
		  ait.method();
		  ait.checkout();
		  //ait.CartMethod();
		  ait.continueclick();
		  //ait.firstnamemethod(firstname);
		  //ait.lastname(lastname);
		  //ait.emailadd(email);
		  //ait.city(city);
		 // ait.selectmethod();
		  //ait.zipcode(zipcode);
		 // ait.orderpagemethod(emailid);
		 //ait.phonenumber(phonenumber);
		  ait.csd();
	  }
	  @AfterTest
	  public void aftermethod() throws InterruptedException {
		  Thread.sleep(3000);
		  driver.close();
	  }
}
}