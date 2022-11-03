package hotelProject.AdactinHotelProject1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SearchHotel extends BaseClass {
	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(id = "room_nos")
	private WebElement roomnumbers;
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	@FindBy(id = "child_room")
	private WebElement childroom;
	@FindBy(id = "Submit")
	private WebElement submit;

	public SearchHotel() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	public void hotelSearch() {
		CommonMethod.getVisibleText(location, "London");
		CommonMethod.getVisibleText(hotels, "Hotel Sunshine");
		CommonMethod.getVisibleText(roomtype, "Standard");
		CommonMethod.getVisibleText(roomnumbers, "2 - Two");
		CommonMethod.getVisibleText(adultroom, "2 - Two");
		CommonMethod.getVisibleText(childroom, "3 - Three");
		CommonMethod.buttonClick(submit);

	}
}
