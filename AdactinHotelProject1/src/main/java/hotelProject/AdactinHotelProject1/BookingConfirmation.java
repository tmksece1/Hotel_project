package hotelProject.AdactinHotelProject1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BookingConfirmation extends BaseClass {

	@FindBy(id = "order_no")
	private WebElement ordernumber;
	@FindBy(id="my_itinerary")
	private WebElement clickmyitinerary;
	@FindBy(id = "order_id_text")
	private WebElement orderid;
	@FindBy(id = "search_hotel_id")
	private WebElement clickanndsearch;
	@FindBy(xpath="//input[contains(@name,'btn')]")
	private WebElement btnid;
	@FindBy(id="search_result_error")
	private WebElement searcherror;
	
	
	
	

	public BookingConfirmation() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	public void confirmBooking() throws InterruptedException {
		
		
		Thread.sleep(5000);

		String getattribute = ordernumber.getAttribute("value");
		System.out.println(getattribute);
		CommonMethod.buttonClick(clickmyitinerary);
		CommonMethod.buttonClick(btnid);
		Alert alert = driver.switchTo().alert();
	    alert.accept();
	    CommonMethod.getTextMethod(searcherror, "print the booking stage");
		
		
		
       
	
		
		
		
	
		
	    
		

	}

}
