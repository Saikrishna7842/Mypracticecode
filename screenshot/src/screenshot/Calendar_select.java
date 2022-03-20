package screenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.abhibus.com/");

		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/a/span")).click();
		
		String month ="May 2022";
		String date ="4";
		Thread.sleep(2000);
		while(true){
			String text=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div")).getText();
			if(text.equals(month)){
				break;
				
			}else{
				driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/a/span")).click();
			}
		}
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/table/tbody/tr[2]/td[3]/a")).click();

	}

}
