package stepdefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pomcucumber.pom_pizza;
import reusable_pizza.pizza_reusable;

public class pizza_stepdefinition extends pizza_reusable{
	public pom_pizza po;
	@Given("user launches the url")
	public void user_launches_the_url() throws InterruptedException {
		launchbrowser();
		loadurl("https://www.pizzahut.co.in/");
		Thread.sleep(10000);
	   
	}
	@Given("click the pizza button")
	public void click_the_pizza_button() {
		po = new pom_pizza();
		buttonclick(po.pizza);
		
	}
	@Given("click the tandoori paneer")
	public void click_the_tandoori_paneer() {
		buttonclick(po.Tandoori);
	}
	@Then("click the san francisco style")
	public void click_the_san_francisco_style() {
		buttonclick(po.sanfrancisco);
	}
	@Then("click extra mushroom")
	public void click_extra_mushroom() {
		buttonclick(po.mushroom);
	}
	@Then("click add to my baskat")
	public void click_add_to_my_baskat() {
		buttonclick(po.Addtomybasket);
	}
	@Then("click the checkout")
	public void click_the_checkout() {
		buttonclick(po.checkout);
	}
	@Then("click the name")
	public void click_the_name() {
		sendinput(po.name, "krishnan");
		
	}
	@Then("click the mobile number")
	public void click_the_mobile_number() {
		sendinput(po.phoneno, "9840980231");
	}
	@Then("entered the email address")
	public void entered_the_email_address() {
		sendinput(po.emailid, "krishjuliet@gmail.com");	
		}
//	@Then("click myaddress button1")
//	public void click_myaddress_button1() {
//		sendinput(, null);
//	   
//	}
//	@Then("click myaddress button2")
//	public void click_myaddress_button2() {
	   
//	}




}
