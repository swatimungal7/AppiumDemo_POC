package Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class BasePage {

	    protected static AppiumDriver<WebElement> driver;
	
	@BeforeTest
	public void setup() 
	{
		 try 
		 {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		//caps.setCapability("platformName", "ANDROID");
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");		
		//caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M31s");
        caps.setCapability(MobileCapabilityType.UDID, "RZ8N912H5SN");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		//caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		//caps.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

  
        //caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        //caps.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
        
        //run this cmd in command prompt --- appium --allow-insecure chromedriver_autodownload----
        
        //caps.setCapability("chromedriverExecutable", "C:\\Users\\swati\\AppData\\Roaming\\npm\\node_modules\\appium\\node_modules\\appium-chromedriver");
        
        //caps.setCapability(MobileCapabilityType.BROWSER_VERSION, "96.0.4664.104");
        
       // caps.setCapability(MobileCapabilityType.APP, "");
        
         URL url = new URL("http://127.0.0.1:4723/wd/hub");
         
         driver = new AppiumDriver<WebElement>(url, caps);

         
        // driver = new AndroidDriver<MobileElement>(url, caps);
       //  driver = new IOSDriver<MobileElement>(url, caps);
         
		} catch (Exception exp) 
		 {
			System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
		 }
 
	}
	//@AfterSuite
	@AfterTest
	public void cleanup()
	{
		driver.close();
		driver.quit();
	}
}
