package pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import helper.Utility;

public class EnrollPage {
	
	
	
	WebDriver driver;
	
	public EnrollPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	
	private By enrollnowheading=By.xpath("//div[@class='modal-title h4']");
	
	private By address= By.xpath("//textarea[@id='address']");
	
	private By phone=By.xpath("//input[@id='phone']");	
		
	private By enrollnow=By.xpath("//button[@class='action-btn']");
	
	
	private By enrollnowaboveheading=By.xpath("//div[@class='modal-title h4']");
	
	private By confirmationmsg=By.xpath("//h4[@class='uniqueId']");
	
	private By cancelbtn=By.xpath("//button[@class='action-btn white-action-btn']");	
	                                        
	
	
	public void enrolldata(String address11, String phone11) throws InterruptedException
	{
			
		Utility.waitForWebElement(driver, enrollnowheading).isDisplayed();		

		Utility.waitForWebElement(driver, address).sendKeys(address11);
		
		//Utility.waitForWebElement(driver, phone).sendKeys(String.valueOf(phone11));
		Utility.waitForWebElement(driver, phone).sendKeys(phone11);
		
				
		Actions act=new Actions(driver);
		act.click(driver.findElement(enrollnow)).build().perform();
		
		
		Utility.waitForWebElement(driver, enrollnowaboveheading).isDisplayed();	
		
		Utility.waitForWebElement(driver, confirmationmsg).isDisplayed();	
		
		Utility.waitForWebElement(driver, cancelbtn).click();
		
		
	}
			


			/*
			 * public boolean isUserLoggedIn() { boolean status=false;
			 * 
			 * try { //driver.findElement(manageOption).isDisplayed();
			 * Utility.waitForWebElement(driver, successful).isDisplayed(); status=true; }
			 * catch(NoSuchElementException e) {
			 * 
			 * } return status;
			 * 
			 * }
			 */
				


	

//	
//	public CartPage navigateToHomePage() {		
//		return new CartPage(driver);
//	}
//	
	
	
	

}
