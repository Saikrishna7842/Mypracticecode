package screenshot;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksSelect {
	
	public static void main(String[] args) throws InterruptedException{
		
		
		System.setProperty("Webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("doctor near");
	 Thread.sleep(2000);
		WebElement ele = driver.findElement(By.className("OBMEnb"));
		
	 List<WebElement> list = driver.findElements(By.xpath("//li[@role='presentation']"));
	 for(WebElement ele1:list){
		 System.out.println(ele1.getText());
	 }
	 for(int i=0;i<list.size();i++){
		 if(list.get(i).getText().contains("me"))
		 {
			 list.get(i).click();
			 break;
		 }
	 }
	 
		 List<WebElement> link=driver.findElements(By.xpath("//*[starts-with(@class,'LC20')]"));
		 
		 System.out.println(link.size());
		 for(int j=0;j<link.size();j++){
			
			
			 String links=link.get(j).getText();
			 
			 System.out.println(links);
		 }
	 
	
		
	
		
			
	}

}
