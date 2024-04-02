package testcases;

import org.testng.annotations.Test;
import pageobjectfactory.signIn;
import java.io.IOException;
import org.testng.annotations.DataProvider;


public class Tc4_clickSignin {
	
	
  signIn s;
	  
	  @Test(priority=1)
	  public void test1() throws InterruptedException 
	  {
		  new Tc1_city();
		  s=new signIn(Tc1_city.driver);
		  s.clickSignIn();
	  }
	  
	  @Test(priority=2)
	  public void test2() throws InterruptedException 
	  {
		  s.clickGoogle();
	  }
	  
	  @Test(priority=3,dataProvider="dp")
	  public void test3(String emailVal) throws InterruptedException 
	  {
		  s.enterEmail(emailVal);
	  }
	  
	  @Test(priority=4)
	  public void test4() throws InterruptedException 
	  {
		  s.clickNext();
		  Thread.sleep(3000);
	  }

	  @DataProvider
	  public Object[] dp()
	  {
		    return new Object[][]
		    {
		    new Object[] { "abc@gmail.com" }
            };
      }
	  @Test(priority=5)
	  public void test5() throws IOException 
	  {
		  s.takeScreenShot();	  
	  }
}
