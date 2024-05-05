package testScripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GooglePageTest {
	WebDriver driver;
	
	@BeforeTest
	//@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
  @Test
  public void javaSearchTest() {
		driver.get("https://www.google.com");
		WebElement srcBox=driver.findElement(By.className("gLFyf"));
		srcBox.sendKeys("Java Tutorial");
		srcBox.submit();
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
		
  }
  @Test
  public void seleniumSearchTest() {
		driver.get("https://www.google.com");
		WebElement srcBox=driver.findElement(By.className("gLFyf"));
		srcBox.sendKeys("Selenium Tutorial");
		srcBox.submit();
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
  }
  @AfterTest
  //@AfterMethod
	public void teardown() {
		driver.close();
	}
  //Test Suite --> Tests --> TestClasses --> TestMethods
}
