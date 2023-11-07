package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class HomePage extends BaseTest {

	@FindBy(xpath = "//a[contains(text(),'Welcome')]")
	WebElement welcomeDisplayed;
	
	@FindBy(xpath = "//a[text()='Cart']")
	WebElement cartbtn;

	@FindBy(xpath = "//div[@class='card-block']//a")
	List<WebElement> items;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyLoggedIn() {
		welcomeDisplayed.isDisplayed();
	}
	
	public void clickCartBtn() {
		cartbtn.click();
	}

	public void clickItem(String itemName) {
		System.out.println(itemName);
		for (WebElement item : items) {
			String text = item.getText();
			if (text.equalsIgnoreCase(itemName)) {
				WebElement itemclick = driver.findElement(By.xpath("//a[text()='" + itemName + "']"));
				itemclick.click();
				break;
			}
		}
	}

}
