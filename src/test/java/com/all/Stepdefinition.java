package com.all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Base {

	public Pojo p;

	@Given("user adactin login page")
	public void user_adactin_login_page() {
		launchBrowser();
		loadUrl("http://adactinhotelapp.com/");
	}

	@When("user entered {string} and {string} user click login button navigate search hotel page")
	public void user_entered_and_user_click_login_button_navigate_search_hotel_page(String username, String password) {
		p = new Pojo();
		toType(p.getUserid(), username);
		toType(p.getPass(), password);
		toclick(p.getBtnlogin());
	}

	@When("user choose {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_choose(String location, String Hotel, String Rommtype, String NumofRooms, String checkIn,
			String checkOut, String adult, String child) {
		toType(p.getLocation(), location);
		toType(p.getHotelname(), Hotel);
		toType(p.getRoom(), Rommtype);
		toType(p.getNoofrooms(), NumofRooms);
		p.getCheckin().clear();
		toType(p.getCheckin(),checkIn);
		p.getCheckout().clear();
		toType(p.getCheckout(), checkOut);
		toType(p.getAdult(), adult);
		toType(p.getChild(), child);
	}

	@When("user click search button user go to next page")
	public void user_click_search_button_user_go_to_next_page() {
		toclick(p.getBtnsearch());
	}

	@When("user choose hotel and click continue button go to payment page")
	public void user_choose_hotel_and_click_continue_button_go_to_payment_page() {
		toclick(p.getBtnradio());
		toclick(p.getBtncontinue());
	}

	@When("user enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter(String firstNm, String lastnm, String addr, String ccNum, String ccType,
			String expmth, String expyr, String ccvNum) {
		toType(p.getFirstname(),firstNm);
		toType(p.getLastname(),lastnm);
		toType(p.getAddress(),addr);
		toType(p.getCardno(),ccNum);
		toType(p.getCardtype(),ccType);
		toType(p.getCardexpmn(),expmth);
		toType(p.getCardexpyr(),expyr);
		toType(p.getCvv(),ccvNum);
	}

	@When("user click book now button and user get booking details")
	public void user_click_book_now_button_and_user_get_booking_details() {
		toclick(p.getBtnbook());
	}

	@Then("user have valid credenttials page")
	public void user_have_valid_credenttials_page() throws InterruptedException {
		Thread.sleep(5000);
		if (driver.getCurrentUrl().contains("Booking")) {
			WebElement orderno = driver.findElement(By.id("order_no"));
			String attribute = orderno.getAttribute("value");
			System.out.println("Your order no:"+attribute);
			System.out.println("Room booked");
			
		} else {
			System.out.println("Room not booked");

		}
		
	}

}
