package hotelProject.AdactinHotelProject1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage {
	@FindBy(xpath = "//a[contains(text(),'New User Register Here')]")
	private WebElement register;
	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(id = "re_password")
	private WebElement repassword;
	@FindBy(id = "full_name")
	private WebElement fullname;
	@FindBy(id = "email_add")
	private WebElement emailid;
    @FindBy(id="Submit")
    private WebElement submit;
    
    
}






























