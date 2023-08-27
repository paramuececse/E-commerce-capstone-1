package Com.BestBuy.Demo;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.openqa.selenium.support.ui.Select;

public class AddItemDemo {
	WebDriver driver;
	
	public AddItemDemo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=("//img[@alt=\"United States\"]"))
	WebElement us;
		
		
	@FindBy(id="gh-search-input") 
	WebElement searchelement;
	
	@FindBy(xpath="(//button[@title='submit search'])[1]")
	WebElement searchclick;
	
	@FindBy(id="cbox-6545286")
	WebElement checkboxclick;
	@FindBy(xpath="//button[@data-button-state=\"ADD_TO_CART\"]")
	WebElement addcart;
	@FindBy(xpath="//button[normalize-space()='Clear all']")
	WebElement clear; 
	
	//c-button c-button-secondary c-button-md c-button-block 
//	(//a[normalize-space()='Go to Cart'])[1]
	@FindBy(xpath="(//a[normalize-space()='Go to Cart'])[1]")
	WebElement addtocart;
	
	@FindBy(xpath="//button[contains(text(),'Menu')]")
	WebElement Menu;
	
	@FindBy(xpath="//button[@data-id=\"node-402\"]")
	WebElement computer;
	
	@FindBy(xpath="//button[@data-id=\"node-302\"]")
	WebElement tablets;
	
	@FindBy(xpath="//a[@data-lid=\"ubr_cp_tab_ipd\"]")
	WebElement ipad;
	
	@FindBy(xpath="(//a[@class='flex-image-inner-wrapper flex-fluid-image'])[1]")
	WebElement ipadpicsclick;
	@FindBy(xpath="//button[@data-cy=\"clear-all-btn\"]")
	WebElement clearall2;
	
	@FindBy(xpath="//label[text()=\"Compare\"]")
	WebElement cbox;
	
	@FindBy(xpath="//button[@data-button-state=\"ADD_TO_CART\"]")
	WebElement addtocart2;
	
	//a[@data-track="Attach Modal: Go to cart"]
	//a[@class=\"c-button c-button-secondary c-button-sm c-button-block \"]
	@FindBy(xpath="//a[@data-track=\"Attach Modal: Go to cart\"]")
	WebElement addtocart3;
	
	@FindBy(xpath="//button[@data-id=\"node-86\"]")
	WebElement brand;
	
	@FindBy(xpath="//a[@data-lid=\"ubr_shp_bbyex\"]")
	WebElement brandsub;
	
	@FindBy(xpath="(//div[@class=\"wc-product-image\"])[2]")
	WebElement product;
	
	@FindBy(xpath="//button[@data-button-state=\"ADD_TO_CART\"]")
	WebElement patc;
	
	@FindBy(xpath="//a[@data-track=\"Attach Modal: Go to cart\"]")
	WebElement atc;
//	
//	@FindBy(xpath="//span[@class=\"cart-label\"]")
//	WebElement Cart;
	
	@FindBy(xpath="//button[@data-track=\"Checkout - Top\"]")
	WebElement checkoutclick;
	
	@FindBy(xpath="//button[text()=\"Continue as Guest\"]")
	WebElement continuetoguest;
	
	@FindBy(id="firstName")   
	WebElement fname;
	
	@FindBy(id="lastName")
	WebElement lname1;
	
	@FindBy(id="street")
	WebElement emailadd;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="state")
	WebElement select;
	
	@FindBy(id="zipcode")
	WebElement zipcode;
	
	@FindBy(id="user.emailAddress")
	WebElement orderpage;
	
	@FindBy(id="user.phone")
	WebElement phonenumber;
	
	@FindBy(xpath="//h1[@class=\"heading-3 fulfillment__page-title\"]")
	WebElement orderconfirm;
	@FindBy(xpath="//button[@class=\"btn btn-lg btn-block btn-secondary\"]")
	WebElement csd;
	
	public void usmethod() {
		us.click();
	}
	
	public void SearchMethod(String s) {
		searchelement.click();
		searchelement.sendKeys(s);
	}
	public void search() {
		searchclick.click();
	}
	public void checkbox() {
		checkboxclick.click();
	}
	public void addcartMethod() {
		addcart.click();
	}
	public void addtocart() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(addtocart));
		addtocart.click();
	}
	public void comparemethod() throws InterruptedException {
		
		clear.click();
		Thread.sleep(3000);
	}
	public void MenuMethod() {
		Menu.click();
	}
	public void computerclick() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(computer));
		computer.click();
		//computer.click();
	}
	public void TabletsMethod() {
		tablets.click();
	}
	public void ipadmethod() {
		ipad.click();
	}
	public void ipadpics() {
		ipadpicsclick.click();
		clearall2.click();
	}
	public void cbox() {
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		 js.executeScript("window.scrollBy(0,300)");
		cbox.click();
	}
	public void addtocartmethod2() throws InterruptedException {
		addtocart2.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(addtocart3));
		Thread.sleep(3000);
		addtocart3.click();
	}
	public void BrandMethod() {
		brand.click();
	}
	public void BrandSub() {
		brandsub.click();
	}
	public void product() {
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		 js.executeScript("window.scrollBy(0,2600)");
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(product));
		product.click();
	}
	public void addtocart3method() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		 js.executeScript("window.scrollBy(0,600)");
//		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait.until(ExpectedConditions.elementToBeClickable(patc));
			patc.click();
			}
	public void method() {
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.elementToBeClickable(atc));
		//Thread.sleep(2000);
		atc.click();
	}
//	public void CartMethod() {
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(Cart));
//		Cart.click();
//	}
	public void checkout() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(checkoutclick));
		checkoutclick.click(); 
	}
	public void continueclick() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(continuetoguest));
		continuetoguest.click();
	}
	public void firstnamemethod(String name) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(fname));
		fname.sendKeys(name);
	}
	public void lastname(String lname) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(lname1));	
	lname1.sendKeys(lname);
	}
	public void emailadd(String emailaddress) {
	emailadd.sendKeys(emailaddress);	
	}
	public void city(String city1) {
		city.sendKeys(city1);
	}
	public void selectmethod() {
		Select s=new Select(select);
		s.selectByVisibleText("AL");
		
		//select.sendKeys(select1);
	}
	public void zipcode(String zipcode1) {
		zipcode.sendKeys(zipcode1);
	}
	
	public void orderpagemethod(String emailid) {
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		 js.executeScript("window.scrollBy(0,600)");
		orderpage.sendKeys(emailid);
	}
	public void phonenumber(String pnumber) {
		phonenumber.sendKeys(pnumber);
	}
	public void csd() throws InterruptedException {
		String actualresult=orderconfirm.getText();
		String expectedresult="Getting your order";
		System.out.println(actualresult);
		System.out.println(expectedresult);
		Assert.assertEquals(actualresult, expectedresult);
		Thread.sleep(3000);
		csd.click();
	}
}
