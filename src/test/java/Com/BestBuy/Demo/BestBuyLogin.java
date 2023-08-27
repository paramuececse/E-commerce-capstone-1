package Com.BestBuy.Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestBuyLogin {
	WebDriver driver;
	public BestBuyLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@alt=\"United States\"]")
	WebElement clickUS;
	@FindBy(xpath="//span[contains(text(),'Account')]")
	WebElement AccountDropDown;
		@FindBy(xpath="//a[contains(text(),'Sign In')]")
		WebElement Loginpbutton;
		
		
		
		@FindBy(id="fld-e")
		WebElement EnterLoginEmailAdrress;
		
		@FindBy(id="fld-p1")
		WebElement EnterLoginPassWordAddress;
		
		@FindBy(xpath="//button[@data-track=\"Sign In\"]")
		WebElement LoginClickButton;
		
		//List<WebElement> menuItems = driver.findElements(By.xpath("data-t=\"header-navigation-container"));

		public void USclick() {
			clickUS.click();
		}
		public void Accountclick() {
			AccountDropDown.click();
		}
		public void LoginButton() {
			Loginpbutton.click();
		}
		public void EnterLoginEmailAdrress(String Email) {
			EnterLoginEmailAdrress.sendKeys(Email);
		}
		public void EnterLoginPassWordAddress(String Password) {
			EnterLoginPassWordAddress.sendKeys(Password);
		}
		public void LoginClickButton() {
			LoginClickButton.click();
		}
}
