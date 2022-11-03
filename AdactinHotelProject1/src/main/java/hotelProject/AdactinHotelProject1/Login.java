package hotelProject.AdactinHotelProject1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Login extends BaseClass {
	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "login")
	private WebElement loginclick;

	public Login() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}


	public void loginPage() {
		System.out.println("username is dispalyed"+username.isDisplayed());
		CommonMethod.sendkeysBox(username, "kumarvenkat");
		System.out.println(""+password.isDisplayed());
		CommonMethod.sendkeysBox(password, "Ram123");
		CommonMethod.buttonClick(loginclick);

	}

}
