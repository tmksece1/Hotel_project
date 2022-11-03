package hotelProject.AdactinHotelProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserClass extends BaseClass {

	public BrowserClass() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	public void launchBrowser(String browser) {
		if(browser.equals("chrome")){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("launched chrome driver browser");
	}else {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("launched the firefox driver browser");
}



	}

	public void launchURL(String browser, String link) {
		
		launchBrowser(browser);
		driver.get(link);
		System.out.println("broswer is launched" + link);

	}
}
