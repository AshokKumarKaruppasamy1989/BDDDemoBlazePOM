package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class CartPage extends BaseTest {
	
	@FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
	WebElement addToCartBtn;
	
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddToCart() {
		addToCartBtn.click();
	}

}
