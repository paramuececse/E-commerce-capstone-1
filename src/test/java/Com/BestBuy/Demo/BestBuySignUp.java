package Com.BestBuy.Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import com.beust.ah.A;

public class BestBuySignUp {
	WebDriver driver;
	public BestBuySignUp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt=\"United States\"]")
	WebElement clickUS;
	
	@FindBy(xpath="//span[contains(text(),'Account')]")
	WebElement AccountDropDown;
	
	@FindBy(xpath="(//a[contains(text(),'Create Account')])[2]")
	WebElement CreateAccount;
	@FindBy(xpath="//a[normalize-space()='Create Account']")
	WebElement CreateAccount1;
	
	@FindBy(xpath="(//a[@role='button'][normalize-space()='Create Account'])[2]")
	WebElement CreateAccount2;
	
	@FindBy(id="firstName")
	WebElement FirstName;
	
	@FindBy(id="lastName")
	WebElement LastName;
	 
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement password;
	@FindBy(xpath="//input[@id='reenterPassword']")
	WebElement confirmpassword;
	
	@FindBy(id="phone")
	WebElement Phone;
	
	@FindBy(xpath="//button[contains(text(),'Create an Account')]")
	WebElement CreateAnAccount;
	public void USclick() {
		clickUS.click();
	}
	public void Accountclick() {
		AccountDropDown.click();
	}
	
	public void CreateAccount() {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(CreateAccount1));
//		Actions ac = new Actions(driver);
//		ac.click(CreateAccount1).perform();
		CreateAccount1.click();
	}
	
	public void FirstName(String FName) {
		FirstName.sendKeys(FName);	
	}
	public void LatName(String LName) {
		LastName.sendKeys(LName);	
	}
	public void Email(String Email) {
		email.sendKeys(Email);	
	}
	public void Password(String Password) {
		password.sendKeys(Password);	
	}
	public void ConfirmPassword(String Email) {
		confirmpassword.sendKeys(Email);	
	}
	 public void Phone(String PhoneNum) {
		 Phone.sendKeys(PhoneNum);
	 }
	 public void CreateAnAccount() {
		 CreateAnAccount.click();
	 }
	
}
