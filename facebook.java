package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    driver.findElement(By.linkText("Create New Account")).click();
	    driver.findElement(By.name("firstname")).sendKeys("vignesh");
	    driver.findElement(By.name("lastname")).sendKeys("Chandrasekar");
	    driver.findElement(By.name("reg_email__")).sendKeys("9551274051");
	    driver.findElement(By.id("password_step_input")).sendKeys("vignesh1710");
	    WebElement test = driver.findElement(By.id("day"));
	    Select dropDown =new Select(test);
	    dropDown.selectByVisibleText("17");
	    WebElement dropDown1 = driver.findElement(By.id("month"));
	    Select month= new Select(dropDown1);
	  month.selectByVisibleText("Oct");
	  WebElement dropDown2 = driver.findElement(By.id("year"));
	  Select year=new Select(dropDown2);
	  year.selectByVisibleText("2000");
	  driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	  driver.close();
	  
	  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}

}
