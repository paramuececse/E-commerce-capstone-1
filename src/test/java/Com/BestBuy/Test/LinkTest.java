package Com.BestBuy.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Browser.webdriver;

import Com.BestBuy.Demo.LinkDemo;
import Com.BestBuyDriverPackage.BestBuyDriverClass;

public class LinkTest extends BestBuyDriverClass{
	WebDriver driver;
	LinkDemo ld;
	
	@BeforeTest
	public void BestBuydriverMethod() throws IOException {
		driver=DriverMethod();
		
	} 
  @Test
  public void LinkMethods() {
	ld=new LinkDemo(driver);
	ld.usmethod();
	ld.linkmethod();
  }
  @AfterTest
  public void aftermethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }
}
