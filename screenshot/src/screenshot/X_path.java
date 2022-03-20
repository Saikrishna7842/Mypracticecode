package screenshot;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class X_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.cheome.drover", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/");
		WebElement ele=driver.findElement(By.xpath("//*[@class='parent'][3]"));
		
		 
	}

}
