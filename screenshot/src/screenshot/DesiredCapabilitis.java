package screenshot;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities ds= new DesiredCapabilities();
		ds.setCapability(ChromeOptions.CAPABILITY, options);
		ChromeDriver driver= new ChromeDriver(ds);
		
		driver.get("http://google.com");
		
		driver.navigate().to("http://gmail.com");
		driver.switchTo().window("http://flipkart.com");
		Set<String> set=driver.getWindowHandles();
		System.out.println(set);
		
		
	}

}
