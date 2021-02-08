package FirstPackage;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Reporter;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Groups extends BaseClass
	{
		@BeforeMethod
		public void handleWindowPopup() throws InterruptedException, AWTException
		{
			driver.manage().window().maximize();
			Thread.sleep(3000);
			Robot r1=new Robot();
			r1.keyPress(KeyEvent.VK_TAB);
			r1.keyPress(KeyEvent.VK_TAB);
			r1.keyPress(KeyEvent.VK_ENTER);
			
		}
		@Test(priority=1)
		public void CreateGroup()
		{
			
			   //GIVIVNG ALL THE DETAILS AND CLICK ON SAVE
			
		WebDriverWait w1=new WebDriverWait(driver,30);
		w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Groups']")));
		driver.findElement(By.xpath("//div[text()='Groups']")).click();
		driver.findElement(By.id("btnCreateNew")).click();
		WebDriverWait w2=new WebDriverWait(driver,50);
		WebElement GroupName=w2.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_GroupName")));
		GroupName.sendKeys("Automation Group2021");
		driver.findElement(By.id("txt_ShortCode")).sendKeys("1b0");
		WebElement w=driver.findElement(By.id("ddl_AppKeyId"));
		Select s1=new Select(w);
		s1.selectByVisibleText("Organizations");
		driver.findElement(By.id("select2-txtAutoComplete_110144181001150_SeriesId-container")).click();
		WebElement seriesName=w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Groups']")));
		seriesName.click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();//save Groups
		w2.until(ExpectedConditions.visibilityOfElementLocated(By.className("jq-toast-heading")));
		String s=driver.findElement(By.className("jq-toast-heading")).getText();
		Reporter.log(s);
		
		
		}
		@Test(priority=2)
		public void WithoutSeries()
		{
			
			//WITHOUT GIVING SERIES NAME DROPDOWN
			
			WebDriverWait w1=new WebDriverWait(driver,30);
			w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Groups']")));
			driver.findElement(By.xpath("//div[text()='Groups']")).click();
			driver.findElement(By.id("btnCreateNew")).click();
			WebDriverWait w2=new WebDriverWait(driver,3);
			WebElement SourceName=w2.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_GroupName")));
			SourceName.sendKeys("Automation Group213");
			driver.findElement(By.id("txt_ShortCode")).sendKeys("1u0");
			WebElement w=driver.findElement(By.id("ddl_AppKeyId"));
			Select s1=new Select(w);
			s1.selectByVisibleText("Organizations");
			driver.findElement(By.xpath("//button[text()='Save']")).click();//save sources
			String s=driver.findElement(By.id("Bizgaze-messageInfo")).getText();
			Reporter.log(s);
		}
		@Test(priority=3)
		public void WithoutType()
		{
			//WITHOUT GIVING GROUP TYPE DROPDOWN
			
			WebDriverWait w1=new WebDriverWait(driver,30);
			w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Groups']")));
			driver.findElement(By.xpath("//div[text()='Groups']")).click();
			driver.findElement(By.id("btnCreateNew")).click();
			WebDriverWait w2=new WebDriverWait(driver,3);
			WebElement SourceName=w2.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_GroupName")));
			SourceName.sendKeys("Automation Group1818");
			driver.findElement(By.id("txt_ShortCode")).sendKeys("1Y0");
			driver.findElement(By.id("select2-txtAutoComplete_110144181001150_SeriesId-container")).click();
			WebElement seriesName=w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Groups']")));
			seriesName.click();
			driver.findElement(By.xpath("//button[text()='Save']")).click();//save sources
			String s=driver.findElement(By.id("Bizgaze-messageInfo")).getText();
			Reporter.log(s);
		}
		@Test(priority=4)
		public void WithoutShortcode()
		{
			
			 //WITHOUT GIVING SHORTCODE DROPDOWN
			
			WebDriverWait w1=new WebDriverWait(driver,30);
			w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Groups']")));
			driver.findElement(By.xpath("//div[text()='Groups']")).click();
			driver.findElement(By.id("btnCreateNew")).click();
			WebDriverWait w2=new WebDriverWait(driver,3);
			WebElement SourceName=w2.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_GroupName")));
			SourceName.sendKeys("Automation Group1818");
			WebElement w=driver.findElement(By.id("ddl_AppKeyId"));
			Select s1=new Select(w);
			s1.selectByVisibleText("Organizations");
			driver.findElement(By.id("select2-txtAutoComplete_110144181001150_SeriesId-container")).click();
			WebElement seriesName=w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Groups']")));
			seriesName.click();
			driver.findElement(By.xpath("//button[text()='Save']")).click();//save sources
			String s=driver.findElement(By.id("Bizgaze-messageInfo")).getText();
			Reporter.log(s);
		}
		@Test(priority=5)
		public void WithoutGroupName()
		{
			
			   //WITHOUT GIVING GROUPNAME TEXTFIELD
			
			WebDriverWait w1=new WebDriverWait(driver,30);
			w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Groups']")));
			driver.findElement(By.xpath("//div[text()='Groups']")).click();
			driver.findElement(By.id("btnCreateNew")).click();
			WebDriverWait w2=new WebDriverWait(driver,3);
			WebElement SourceName=w2.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_ShortCode")));
			driver.findElement(By.id("txt_ShortCode")).sendKeys("1Y0");
			WebElement w=driver.findElement(By.id("ddl_AppKeyId"));
			Select s1=new Select(w);
			s1.selectByVisibleText("Organizations");
			driver.findElement(By.id("select2-txtAutoComplete_110144181001150_SeriesId-container")).click();
			WebElement seriesName=w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Groups']")));
			seriesName.click();
			driver.findElement(By.xpath("//button[text()='Save']")).click();//save sources
			String s=driver.findElement(By.id("Bizgaze-messageInfo")).getText();
			Reporter.log(s);
		}
		@Test(priority=6)
		public void WithoutData()
		{
			
			  //WITHOUT GIVING DATA CLICK ON SAVE
			
			WebDriverWait w1=new WebDriverWait(driver,30);
			w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Groups']")));
			driver.findElement(By.xpath("//div[text()='Groups']")).click();
			driver.findElement(By.id("btnCreateNew")).click();
			w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Save']")));
			driver.findElement(By.xpath("//button[text()='Save']")).click();//save sources
			String s=driver.findElement(By.id("Bizgaze-messageInfo")).getText();
			Reporter.log(s);
			
		}
		@Test(priority=7)
		public void DuplicateData()
		{
			 
			  //BY GIVING DUPLICATE DATA
			
			WebDriverWait w1=new WebDriverWait(driver,30);
			w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Groups']")));
			driver.findElement(By.xpath("//div[text()='Groups']")).click();
			driver.findElement(By.id("btnCreateNew")).click();
			WebDriverWait w2=new WebDriverWait(driver,3);
			WebElement SourceName=w2.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_GroupName")));
			SourceName.sendKeys("Automation Group2021");
			driver.findElement(By.id("txt_ShortCode")).sendKeys("1b0");
			WebElement w=driver.findElement(By.id("ddl_AppKeyId"));
			Select s1=new Select(w);
			s1.selectByVisibleText("Organizations");
			driver.findElement(By.id("select2-txtAutoComplete_110144181001150_SeriesId-container")).click();
			WebElement seriesName=w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Groups']")));
			seriesName.click();
			driver.findElement(By.xpath("//button[text()='Save']")).click();//save sources
			w2.until(ExpectedConditions.visibilityOfElementLocated(By.id("Bizgaze-messageInfo")));
			String s=driver.findElement(By.id("Bizgaze-messageInfo")).getText();
			Reporter.log(s);
		}
	}
