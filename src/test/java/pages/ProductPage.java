package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class ProductPage extends BaseTest {

	@FindBy(xpath = "//td")
	List<WebElement> items;
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyItemAdded(String itemName) {
		for (WebElement item : items) {
			String text = item.getText();
			if (text.equalsIgnoreCase(itemName)) {
				WebElement itemclick = driver.findElement(By.xpath("//td[text()='" + itemName + "']"));
				itemclick.isDisplayed();
				break;
			}
		}
	}

}
