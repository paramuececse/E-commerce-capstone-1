package Com.BestBuy.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.BestBuy.Demo.MenuList;
import Com.BestBuyDriverPackage.BestBuyDriverClass;

public class MenuTest extends BestBuyDriverClass{
	WebDriver driver;
	MenuList ML;
	@BeforeTest
	public void BestBuydriverMethod() throws IOException {
		driver=DriverMethod();
	}
  @Test
  public void MenuPage() {
	  ML=new MenuList(driver);
	  ML.usclick();
	  ML.listmethod();
	  ML.firstelementclick();
	  ML.listmethod1();
	  ML.schoollink();
	  ML.title();
  }
  @AfterTest
  public void aftermethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }
}
