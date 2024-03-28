package selenium2;
import java.io.FileOutputStream;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.io.File;
public class project2 {
	public static void main(String[] args) throws IOException, InterruptedException {
        

		 WebDriver driver = new ChromeDriver();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     driver.get("https://in.bookmyshow.com/");
	     driver.manage().window().maximize();
	     //driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input")).click();
	     //List.findElements(By.xpath("//*[@id=\"_nkw\"]")).sendKeys("outdoor toys");
	     List<WebElement> clickcity =driver.findElements(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input"));
	     for(int i=0;i<=clickcity.size();i++)
			{
				if(clickcity.get(i).getText().equalsIgnoreCase("pune")) {
					clickcity.get(i).click();
					
				}
			}
			 
	    // Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div[2]/div/div[1]/div/div[1]/div/div")).click();
	     driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("sdhgdh");
	     
	    // driver.findElement(By.xpath(""));
	     
	}
}

		
	
		
		
	


