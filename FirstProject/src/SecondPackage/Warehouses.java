package SecondPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import FirstPackage.BaseClass;

public class Warehouses extends BaseClass
{
	@Test
	public void create() 
	{
		WebDriverWait w1=new WebDriverWait(driver,30);
		w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Warehouses']")));
		driver.findElement(By.xpath("//div[text()='Warehouses']")).click();
		driver.findElement(By.id("btnCreateNew")).click();
		WebDriverWait w2=new WebDriverWait(driver,30);
		w2.until(ExpectedConditions.presenceOfElementLocated(By.id("txt_AliasName")));
		driver.findElement(By.id("txt_AliasName")).sendKeys("Primary");
		driver.findElement(By.id("txt_ShortCode")).sendKeys("S0B");
		WebElement w =driver.findElement(By.id("ddl_BranchTypeId"));
		Select s1 = new Select(w);
		s1.selectByVisibleText("Warehouse");
		driver.findElement(By.id("select2-txtAutoComplete_110144181001319_CompanyId-container")).click();
		WebElement CompanyName = w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Bizgaze']")));
		CompanyName.click();
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
