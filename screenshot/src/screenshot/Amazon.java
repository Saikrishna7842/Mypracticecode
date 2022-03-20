package screenshot;

import java.awt.Dimension;
import java.awt.Window;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.zeromq.ZStar.Set;

import io.netty.util.Timeout;

public class Amazon {
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		System.setProperty("Webdriver.chromedriver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http:amazon.in/");
		driver.switchTo().frame(0);
		
		
		Select sec = new Select(driver.findElement(By.id("krishna")));
		sec.selectByIndex(0);
		
	 String de =driver.getWindowHandle();
	 java.util.Set<String> sa = driver.getWindowHandles();
		
		
		
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		
		WebElement sa1= driver.findElement(By.id("sai"));
		Actions act= new Actions(driver);
		act.dragAndDrop(sa1, sa1);
		
		//Select sec = new Select(driver.findElement(By.className("autocomplete-results-container")));
		
		Actions acts = new Actions(driver);
		act.contextClick().build().perform();
		
		
		List<WebElement> lis = driver.findElements(By.className("autocomplete-results-container"));
		
		Thread.sleep(2000);
		 
		
	      for(int i=0;i<lis.size();i++){
			
	    	  System.out.println(lis.get(i).getText());
	    	 
			if(lis.get(i).getText().equalsIgnoreCase("iphone 13 case"))
			{
			
				lis.get(i).click();
				break;
		}
		//driver.close();
		}
	}
}
