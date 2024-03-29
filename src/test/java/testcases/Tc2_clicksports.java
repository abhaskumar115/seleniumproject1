package testcases;

import org.testng.annotations.Test;

import pageobjectfactory.homePage;



public class Tc2_clicksports {
	homePage hm;
  @Test
  public void f() {
	  new Tc1_city();
		hm=new homePage(Tc1_city.driver);
		hm.clickSports();
	  
  }
  

}
