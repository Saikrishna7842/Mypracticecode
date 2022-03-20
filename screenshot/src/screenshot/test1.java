package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {

	@Test
	public void Loginpage() throws InterruptedException{
	System.setProperty("webdriver.chromdriver", "chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demoqa.com/widgets");
	
	driver.findElement(By.className("card-up")).click();
	//driver.findElement(By.className("(//*[@id='item-0'])[1]")).click();
	driver.findElement(By.xpath("//*//*[text()='Text Box']")).click();
	driver.findElement(By.id("userName")).sendKeys("saikrishna");
	driver.findElement(By.xpath("//*[@type='email']")).sendKeys("saikrishnamada@gmail.com");
	driver.findElement(By.id("currentAddress")).sendKeys("Nellore");
	driver.findElement(By.id("permanentAddress")).sendKeys("Nellore");
	Thread.sleep(4000);
	driver.findElement(By.id("submit")).click();
	
	String exp=driver.findElement(By.id("name")).getText();
	System.out.println(exp);
	
	String exp1=driver.findElement(By.id("email")).getText();
	System.out.println(exp1);
	
	String exp2=driver.findElement(By.id("currentAddress")).getText();
	System.out.println(exp2);
	
	String exp3=driver.findElement(By.id("permanentAddress")).getText();
	System.out.println(exp3);
	
	
			
	
	
	
	
	
	
	
	
	
}
}
