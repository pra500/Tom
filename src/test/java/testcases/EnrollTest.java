package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import dataProvider.CustomDataProvider;
import pages.CartPage;
import pages.EnrollPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;

public class EnrollTest extends BaseClass{
	/*
	 * @BeforeClass public void Setup() { accPage =
	 * loginPage.doLogin(prop.getProperty("username"),
	 * prop.getProperty("password"));
	 * 
	 * 
	 * HomePage=sign.signupenterdetails(unamee, emiall); }
	 */
		
	
	
	
	

	/*
	 * @Test(priority = 0, dataProvider = "userData",dataProviderClass =
	 * CustomDataProvider.class) public void loginWithValidCredentials(String
	 * unamee,String emiall) throws InterruptedException { SignupPage sign=new
	 * SignupPage (driver);
	 * 
	 * sign.signupenterdetails(unamee, emiall);
	 * 
	 * //Assert.assertTrue(sign.isUserLoggedIn(),"Login failed");
	 * 
	 * 
	 * 
	 * }
	 */


  
	@Test(priority = 1, dataProvider = "userData1",dataProviderClass = CustomDataProvider.class)
	public void logintoapp(String emailll,String pwddd) throws InterruptedException
	{
	
		
  LoginPage lp=new LoginPage(driver);
  lp.logindata(emailll, pwddd);
  
    		
	}
	
	

	
	
	
	
    @Test(priority = 2)
	public void homepagedetails() throws InterruptedException
	{
    	
	  HomePage hm=new HomePage(driver);
	  hm.homedata();
	  		
	}
    
    
    @Test(priority = 3)
	public void cartpagedetails() throws InterruptedException
	{
    	
	  CartPage cp=new CartPage(driver);
	  cp.cartdata();
	  		
		
	}     
    
        
    @Test(priority = 4, dataProvider = "userData2",dataProviderClass = CustomDataProvider.class)
	public void enrollforcourse(String Address,String Phonenumber) throws InterruptedException
	{	
    	Thread.sleep(6000);
    	 EnrollPage ep=new EnrollPage(driver);
   	     ep.enrolldata(Address, Phonenumber); 
   	     
	}
   
  
  
}
