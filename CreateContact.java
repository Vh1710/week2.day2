package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
	    driver.findElement(By.linkText("Contacts")).click();
	    driver.findElement(By.linkText("Create Contact")).click();
	    driver.findElement(By.className("selected")).click();
	    driver.findElement(By.id("firstNameField")).sendKeys("vignesh");
	    driver.findElement(By.id("lastNameField")).sendKeys("C");
	    driver.findElement(By.name("departmentName")).sendKeys("engineer");
	    driver.findElement(By.name("description")).sendKeys("feild worker");
	    driver.findElement(By.name("primaryEmail")).sendKeys("reyvicky0@gmail.com");
	    WebElement dropDown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	    Select state =new Select(dropDown);
	    state.selectByValue("NY");
	    driver.findElement(By.name("submitButton")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.name("description")).clear();
	    driver.findElement(By.name("importantNote")).sendKeys("local worker");
	    driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	}

}
