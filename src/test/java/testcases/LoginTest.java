package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import dataProvider.CustomDataProvider;
//import pages.LoginPage;
import pages.SignupPage;

public class LoginTest extends BaseClass {
  
	
    @Test(dataProvider = "userData",dataProviderClass = CustomDataProvider.class)
	public void loginWithValidCredentials(String unamee,String emiall) throws InterruptedException
	{
		SignupPage sign=new SignupPage (driver);
		
		sign.signupenterdetails(unamee, emiall);
		
		//Assert.assertTrue(sign.isUserLoggedIn(),"Login failed");
			
		
		
	}
}
