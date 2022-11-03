package hotelProject.AdactinHotelProject1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SelectHotel extends BaseClass {
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;
	@FindBy(id = "continue")
	private WebElement continueclick;

	public SelectHotel() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

	}

	public void hotelSelect() {
		CommonMethod.buttonClick(radiobutton);
		CommonMethod.buttonClick(continueclick);

	}

}
