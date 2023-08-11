package pomcucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusable_pizza.pizza_reusable;

public class pom_pizza extends pizza_reusable {
	public pom_pizza() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "(//span[text()='Pizzas'])[2]")
	public WebElement pizza;
	@FindBy(xpath = "(//div[text()='Tandoori Paneer'])[1]")
	public WebElement Tandoori;
	@FindBy(xpath = "(//div[text()='San Francisco Style'])[2]")
	public WebElement sanfrancisco;
	@FindBy(xpath = "//div[text()='Mushroom']")
	public WebElement mushroom;
	@FindBy(xpath = "//span[text()='Add to my basket']")
	public WebElement Addtomybasket;
	@FindBy(xpath = "//span[text()='Checkout']")
	public WebElement checkout;
	@FindBy(id = "checkout__name")
	public WebElement name;
	@FindBy(id = "checkout__phone")
	public WebElement phoneno;
	@FindBy(id = "checkout__email")
	public WebElement emailid;
//	public WebElement getPizza() {
//		return pizza;
//	}
//	public WebElement getTandoori() {
//		return Tandoori;
//	}
//	public WebElement getSanfrancisco() {
//		return sanfrancisco;
//	}
//	public WebElement getMushroom() {
//		return mushroom;
//	}
//	public WebElement getAddtomybasket() {
//		return Addtomybasket;
//	}
//	public WebElement getCheckout() {
//		return checkout;
//	}
//	public WebElement getName() {
//		return name;
//	}
//	public WebElement getPhoneno() {
//		return phoneno;
//	}
//	public WebElement getEmailid() {
//		return emailid;
//	}
	

	

	
	

	

}
