package screenshot;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.mustache.Value;

import graphql.language.Document;

public class scre {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		
		
		String sa="sai";
		String rev= "";

		int length=sa.length();

		for(int i=length-1;i>=0;i--){

		rev=rev+sa.charAt(i);

		}
		System.out.println(rev);

		int a=12345;
		int temp=0;

		while(a!=0){

		temp=temp*10+a%10;
		a=a/10;


		}
		System.out.println(temp);
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		
		//driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("http://www.amazon.in");
		WebElement ele=driver.findElement(By.id("sai"));
		
		 Select sec = new Select(ele);
		 sec.selectByIndex(1);
		 
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("driver.getElement(By.id('sai').Value='sai'");
		 driver.findElement(By.id("sai")).submit();
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.alertIsPresent());
		 TakesScreenshot ts =(TakesScreenshot)driver;
			File srcfile = ts.getScreenshotAs(OutputType.FILE);
			File destfile = new File("C:\\Bug\\SAI.bmp");
			
			FileUtils.copyFile(srcfile, destfile);
			driver.close();
			WebElement elea=driver.findElement(By.name("saikrishna"));
			Actions act = new Actions(driver);
		
			
			act.moveToElement(elea).build().perform();
			driver.switchTo().alert().dismiss();
			
				
				
			
			
		//driver.get("http://google.com");
		
		 //List<WebElement> s=    driver.findElements(By.tagName("a"));
		  //JavascriptExecutor jp =(JavascriptExecutor)driver;
		// driver.get("http://amazon.com");
		//jp.executeScript("window.scrollBy(0,1000)");
	
		 
		// Actions action = new Actions(driver);
	
		
		
		 //driver.findElement(By.id("input")).sendKeys("krishna");
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		
		// WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		 //js.executeScript("window.scrollBy(0,1000)");
		 //j.executeScript("window.s)
		 
		// j.executeScript(document.g, args)
		// j.executeScript(driver.findElement(By.id("input")), value="sai")
		 
		 //driver.navigate().to("https://www.youtube.com/");
		// driver.findElement(By.cssSelector("#guide-icon")).click();
		// action.moveToElement(driver.findElement(By.linkText("Gmail"))).doubleClick();
			//action.perform();
		
		//	
				
			}


}
		//System.out.println(s.size());
		/**/
		//driver.close();

	


