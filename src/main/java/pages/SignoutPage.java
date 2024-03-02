package pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utility;

public class SignoutPage {
	

    WebDriver driver;
	
	public SignoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
		
	
		
	private By signouticon=By.xpath("//img[@alt='menu']");
	
	private By SignOut=By.xpath("//button[@class='nav-menu-item']");
	
	
	
public void signoutdata() throws InterruptedException
{	
		
	Utility.waitForWebElement(driver, signouticon).click();

	Utility.waitForWebElement(driver, SignOut).click();
	
}
	
	

/*
 * 
 * public boolean isUserLoggedIn() throws InterruptedException { boolean
 * status=false;
 * 
 * try { //driver.findElement(manageOption).isDisplayed();
 * 
 * 
 * Utility.waitForWebElement(driver, successful).isDisplayed(); status=true; }
 * catch(NoSuchElementException e) {
 * 
 * }
 * 
 * return status;
 * 
 * }
 */

 
	

/*
 * public HomePage navigateToHomePage() throws InterruptedException {
 * Thread.sleep(12000); return new HomePage(driver); }
 */





	
	
}
