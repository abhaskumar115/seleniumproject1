package day1;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
 
public class test1 {
	  @Test(priority=1)
	public void test_launch_webapplication() {
		System.out.println("senario1");
		assertEquals(true, true);
	}
	  @Test(priority=3)
	public void test_login() {
		System.out.println("senario2");
 
	}
	  @Test(priority=2)
	public void test_registration() {
		System.out.println("senario3");
	}
}