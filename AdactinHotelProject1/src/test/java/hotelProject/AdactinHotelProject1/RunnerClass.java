package hotelProject.AdactinHotelProject1;

import org.testng.annotations.BeforeTest;
  
import org.testng.annotations.Test;

public class RunnerClass extends BaseClass {

	@BeforeTest
	public void launchURL() {
		new BrowserClass().launchURL(browser, demourl);

	}

	@Test(priority = 1)
	public void loginEnter() {

		new Login().loginPage();

	}

	
	@Test (priority = 2)
	public void researchHotel() {
		new SearchHotel().hotelSearch();

	}

	@Test(priority = 3)
	public void clickSearchHotel() {
		new SelectHotel().hotelSelect();

	}

	@Test(priority = 4)
	public void bookNowHotel() {
		new BookHotel().hotelBooking();

	}

	@Test(priority = 5)
	private void clickBookingConfirm() throws InterruptedException {
		new BookingConfirmation().confirmBooking();

	}
	@After Test

}
