package hotelProject.AdactinHotelProject1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BookHotel extends BaseClass {
	@FindBy(id = "first_name")
	private WebElement firstname;
	@FindBy(id = "last_name")
	private WebElement lastname;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement creditcardnumber;
	@FindBy(id = "cc_type")
	private WebElement creditcardtype;
	@FindBy(id = "cc_exp_month")
	private WebElement expirymonth;
	@FindBy(id = "cc_exp_year")
	private WebElement expiryyear;
	@FindBy(id = "cc_cvv")
	private WebElement cvvnumber;
	@FindBy(id = "book_now")
	private WebElement booknowclick;

	public BookHotel() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	public void hotelBooking() {
		CommonMethod.sendkeysBox(firstname, "muthukumar");
		CommonMethod.sendkeysBox(lastname, "Samy");
		CommonMethod.sendkeysBox(address, "No:12 sholinganallur,chennai600119");
		CommonMethod.sendkeysBox(creditcardnumber, "1234567891234567");
		CommonMethod.sendkeysBox(creditcardtype, "VISA");
		CommonMethod.getVisibleText(expirymonth, "March");
		CommonMethod.getVisibleText(expiryyear, "2018");
		CommonMethod.sendkeysBox(cvvnumber, "654");
		CommonMethod.buttonClick(booknowclick);
	}
}
