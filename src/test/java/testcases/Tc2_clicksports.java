package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjectfactory.homePage;



public class Tc2_clicksports {
	homePage hm;
  @Test
  public void f() throws InterruptedException, IOException {
	  new Tc1_city();
		hm=new homePage(Tc1_city.driver);
		hm.clickSports();
	    Thread.sleep(3000);
	    hm.sportsName();
  }
  

}
