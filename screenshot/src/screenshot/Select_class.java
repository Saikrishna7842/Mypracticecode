package screenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		
		
		driver.findElement(By.xpath("//*[starts-with(@id,'u_0_2')]")).click();
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.xpath("//*[@title='Month']"));
		WebElement year = driver.findElement(By.xpath("//*[@aria-label='Year']"));
		
		/*Select select = new Select(day);
		select.selectByVisibleText("24");
		
		Select select1 = new Select(month);
		select1.selectByValue("6");
		
		Select select2 = new Select(year);
		select2.selectByVisibleText("1996");*/
		
		selectDropDown(year, "1995");
		selectDropDown(month, "May");
		selectDropDown(day, "25");
		
		
		
		}
		
	public static void selectDropDown(WebElement element,String value){
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}

}
