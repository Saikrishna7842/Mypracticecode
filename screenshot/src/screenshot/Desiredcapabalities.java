package screenshot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desiredcapabalities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities ds= new DesiredCapabilities();
		ds.setCapability(ChromeOptions.CAPABILITY, options);
		//ChromeDriver driver= new ChromeDriver();
		//ds.setCapability(ChromeOptions.CAPABILITY, options);
		//ChromeDriver driver= new ChromeDriver(ds);
	}

}
