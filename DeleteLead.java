package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    WebElement dropDown = driver.findElement(By.className("x-tool x-tool-toggle "));
	    Select lead =new Select(dropDown);
	    lead.deselectByVisibleText("x-tool x-tool-toggle");
	    driver.findElement(By.name("phoneNumber")).sendKeys("91");
	    driver.findElement(By.className("Find Leads")).click();
	    driver.findElement(By.className("linktext")).click();
	    driver.findElement(By.className("subMenuButtonDangerous")).click();
	    
	    

	}

}
