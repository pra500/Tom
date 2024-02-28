package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import dataProvider.CustomDataProvider;
import pages.HomePage;
import pages.SignupPage;

public class HomeTest extends BaseClass{
	
	
		

    @Test
	public void homepagedetails() throws InterruptedException
	{
    	
	  HomePage hm=new HomePage(driver);
	  hm.homedata();
	  
	  		
		
		
	}
    

  
  
  
  
}
