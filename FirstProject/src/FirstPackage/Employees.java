package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
@Test
	public class Employees extends BaseClass
	{
	public void creation()
	{
		
		WebDriverWait w1=new WebDriverWait(driver,30);
		w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Employees']")));
		driver.findElement(By.xpath("//div[text()='Employees']")).click();
		driver.findElement(By.id("btnCreateNew")).click();
		w1=new WebDriverWait(driver,30);
				driver.findElement(By.id("txt_FirstName")).sendKeys("Kalavena");
				driver.findElement(By.id("txt_LastName")).sendKeys("Prashanth");
				driver.findElement(By.id("select2-txtAutoComplete_110152181001632_ManagerId-container")).click();
				driver.findElement(By.xpath("//span[title()='Manohar(Admin)']")).click();
				driver.findElement(By.id("select2-txtAutoComplete_110152181001633_DesignationId-container")).click();
				driver.findElement(By.xpath("//span[title()='Account Manager']")).click();
				
				//WebElement Title=driver.findElement(By.id("ddl_TitleId"));
				//Select s1=new Select(Title);
			  //	s1.selectByIndex(1);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
