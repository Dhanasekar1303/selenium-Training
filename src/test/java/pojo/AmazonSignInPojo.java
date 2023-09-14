package pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignInPojo extends BaseClass {
	public AmazonSignInPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement Accounts;
	@FindBy(name="email")
	private WebElement emailorMobileNo;
	@FindBy(id="continue")
	private WebElement clickEmailContinueBtn;
	@FindBy(id="ap_password")
	private WebElement password;
	@FindBy(id="signInSubmit")
	private WebElement ClickSignIn;
	public WebElement getAccounts() {
		return Accounts;
	}
	public WebElement getEmailorMobileNo() {
		return emailorMobileNo;
	}
	public WebElement getClickEmailContinueBtn() {
		return clickEmailContinueBtn;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getClickSignIn() {
		return ClickSignIn;
	}
}
