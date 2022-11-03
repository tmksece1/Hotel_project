package hotelProject.AdactinHotelProject1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethod extends BaseClass {

	public static void sendkeysBox(WebElement element, String text) {
		try {
			
		element.sendKeys(text);
		
	}catch (Exception e) {
		System.out.println(e);
	}
	}

	public static void buttonClick(WebElement eleement) {
		try {
			eleement.click();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void getAttributtevalue(WebElement element) {

		String data = element.getAttribute("value");
		System.out.println(data);

	}

	public static void getTextMethod(WebElement element, String text1) {
		try {
			String text = element.getText().toString();

			System.out.println("Get the text: " + text);
		} catch (Exception e) {
			System.out.println("text is not available");
		}

	}

	public static void getVisibleText(WebElement element, String data) {

		Select select = new Select(element);
		select.selectByVisibleText(data);
	    
	}

	public static void alertMethod() {
	
			Alert alert = driver.switchTo().alert();
			alert.accept();

		
	}
	public static void clearMethod(WebElement element) {
		 element.clear();

	}
}
