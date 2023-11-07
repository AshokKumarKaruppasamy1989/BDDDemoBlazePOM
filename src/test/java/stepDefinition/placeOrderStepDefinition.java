package stepDefinition;

import java.util.List;

import base.BaseTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class placeOrderStepDefinition extends BaseTest {

	LoginPage login;
	HomePage home;
	CartPage cart;
	ProductPage product;

	@Before
	public void setUp() {
		initialize();
	}

	@Given("Login into APP")
	public void login_into_app(DataTable userdata) throws InterruptedException {
		login = new LoginPage();
		home = new HomePage();
		List<List<String>> data = userdata.asLists();
		String strUser = data.get(0).get(0);
		String strPwd = data.get(0).get(1);
		login.clickHomeLogIn();
		login.logIn(strUser, strPwd);
		Thread.sleep(3000);
		home.verifyLoggedIn();
	}

	@When("Add an item to cart {string}")
	public void add_an_item_to_cart(String item) throws InterruptedException {
		home = new HomePage();
		cart = new CartPage();
		home.clickItem(item);
		Thread.sleep(3000);
		cart.clickAddToCart();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	
	}

	@Then("Items must be added to the cart {string}")
	public void items_must_be_added_to_the_cart(String item) throws InterruptedException {
		home = new HomePage();
		product = new ProductPage();
		home.clickCartBtn();
		Thread.sleep(3000);
		product.verifyItemAdded(item);
	}


	@When("List tof items should be available in cart")
	public void list_tof_items_should_be_available_in_cart() {

	}

	@Then("Delete an item from cart")
	public void delete_an_item_from_cart() {

	}

	@When("Items should be available in cart")
	public void items_should_be_available_in_cart() {

	}

	@Then("Place Order")
	public void place_order() {

	}

	@Then("Then Purchase Items")
	public void then_purchase_items() {

	}

}
