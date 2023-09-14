package pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IciciPojo extends BaseClass{
	public IciciPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement login;
	@FindBy(id="DUMMY1")
	private WebElement userId;
	@FindBy(id="AuthenticationFG.ACCESS_CODE")
	private WebElement password;
	@FindBy(name="Action.VALIDATE_CREDENTIALS")
	private WebElement iciciLogin;
	public WebElement getLogin() {
		return login;
	}
	public WebElement getUserId() {
		return userId;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getIciciLogin() {
		return iciciLogin;
	}

}
