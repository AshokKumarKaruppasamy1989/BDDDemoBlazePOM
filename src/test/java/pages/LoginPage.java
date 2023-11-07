package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class LoginPage extends BaseTest {

	@FindBy(id = "login2")
	WebElement homeLogInBtn;

	@FindBy(xpath = "//input[@id='loginusername']")
	WebElement userName;

	@FindBy(xpath = "//input[@id='loginpassword']")
	WebElement password;

	@FindBy(xpath = "//button[text()='Log in']")
	WebElement logInBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickHomeLogIn() {
		homeLogInBtn.click();
	}

	public void logIn(String strUser, String strPwd) {
		userName.sendKeys(strUser);
		password.sendKeys(strPwd);
		logInBtn.click();
	}

	public void verifyLogInBtn() {
		logInBtn.isEnabled();
	}

}
