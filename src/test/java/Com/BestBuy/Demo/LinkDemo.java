package Com.BestBuy.Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkDemo {
	WebDriver driver;
	public LinkDemo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//img[@alt=\\\"United States\\\"]")
//	WebElement us;
@FindBy(xpath=("//img[@alt=\"United States\"]"))
WebElement us;
	
	public void usmethod() {
		us.click();
	}
	
public void linkmethod() {
	List<WebElement> links = driver.findElements(By.xpath("//li[@class=\"body-copy\"]"));
    WebElement linktext; 
    System.out.println("Getting link text from website: links are");
    JavascriptExecutor js = (JavascriptExecutor)driver;		
	 js.executeScript("window.scrollBy(0,600)");
    for(int i=0;i<links.size();i++) {
    	linktext=links.get(i);
   	 String linktext1=linktext.getText();
   	 System.out.println(linktext1);
    }
}
}