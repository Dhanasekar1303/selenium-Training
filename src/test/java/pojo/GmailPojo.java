package pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPojo extends BaseClass{
	public GmailPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="identifierId")
	private WebElement email;
	@FindBy(xpath="//span[text()='Next']")
	private WebElement emailNextBtn;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(xpath="//span[text()='Next']")
	private WebElement passwordNextBtn;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getEmailNextBtn() {
		return emailNextBtn;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getPasswordNextBtn() {
		return passwordNextBtn;
	}
}
