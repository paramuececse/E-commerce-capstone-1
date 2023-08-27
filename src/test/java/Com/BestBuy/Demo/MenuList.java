package Com.BestBuy.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
public class MenuList {
	WebDriver driver;
	public MenuList(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@alt=\"United States\"]")
	WebElement us;
  
	@FindBy(xpath="//span[@class=\"v-p-right-xxs utility-nav-drawer-btn-label\"]")
	WebElement elementclick;
	
	@FindBy(xpath="//li[@class=\"liDropdownList\"]")
	WebElement elementclick1;
	
	@FindBy(xpath="//span[@class=\"heading-3 v-fw-bold\"]")
	WebElement titlecheck;
	
	public void usclick() {
		us.click();
	}
	public void listmethod() {
		List<WebElement> menuItems=driver.findElements(By.xpath("//div[@class=\"bottom-nav-left-wrapper\"]"));
		WebElement menuItem;
		for(int i=0;i<menuItems.size();i++) {
			 menuItem=menuItems.get(i);
			 String menuText=menuItem.getText();
			 System.out.println(menuText);
 
		}}
	
		public void firstelementclick() {
			
		elementclick.click();
	
	}
		public void listmethod1() {
			List<WebElement> Backtoschool=driver.findElements(By.xpath("//ul[@class=\"utility-nav-drawer-flyout-list\"]"));
			WebElement schoollist;
			//String [] s=new String[Backtoschool.size()];
			
			for(WebElement links:Backtoschool) {
				System.out.println(links.getText() + " - " + links.getAttribute("href"));
	 
			}}
			public void schoollink() {
				elementclick1.click();
			}
			public void title() {
			String s=	titlecheck.getText();
			String s1=driver.getTitle();
			System.out.println("title :"+s);
			System.out.println("page title :"+s1);
			
			}
			}

