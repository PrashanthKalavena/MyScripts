package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
public static WebDriver driver;
public static WebDriverWait w1;

@BeforeTest
public void OpenBrowser()
{
	System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
	driver=new ChromeDriver();
	
}
	
@BeforeClass	
public void login()
{
	driver.get("https://testv3.bizgaze.com");
	driver.findElement(By.id("InputEmail")).sendKeys("dmanohar1234@gmail.com");
	driver.findElement(By.id("InputPassword")).sendKeys("123456");
	driver.findElement(By.id("BtnLogin")).click();
}

/* @AfterClass
public void Logout()
{
	w1=new WebDriverWait(driver,30);
	//WebElement Logout=w1.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginUserImg")));
	//Logout.click();
	driver.findElement(By.id("LoginUserImg")).click();
	driver.findElement(By.xpath("//span[text()='Log out]")).click();
	
	
}
@AfterTest
public void CloseBrowser()
{
	driver.close();
}

*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
