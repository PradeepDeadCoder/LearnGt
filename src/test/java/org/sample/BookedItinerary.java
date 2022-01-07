package org.sample;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary extends BaseClass {

	public BookedItinerary() {
	PageFactory.initElements(driver, this);	
	
	}
	
	@FindBy(xpath="//input[@name='order_id_text']")
	private WebElement txtSearch;
	
	@FindBy(xpath="//input[@id='search_hotel_id']")
	private WebElement btnClick;
	
	@FindBy(xpath="//input[@name='ids[]']")
	private WebElement btnRadio;
	
	@FindBy(xpath="(//input[contains(@value,'Cancel')])[1]")
	private WebElement btnSearchClick;
	
	@FindBy(xpath="//td[text()='Booked Itinerary']")
	private WebElement verify;
	
	@FindBy(id="search_result_error")
	private WebElement verify1;
	
	public WebElement getVerify() {
		return verify;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtnSearchClick() {
		return btnSearchClick;
	}

	public void verifyBookedItinerary() {
		String text = getText(verify);
		Assert.assertEquals("verify", "Booked Itinerary", text);
		System.out.println(text);
	}
	
	public void cancelBooking(String data) {
		
		type(txtSearch, data);
		click(btnClick);
		click(btnRadio);
		click(btnSearchClick);
		alertAccept();
	}	
	
	public void verifyLast() {
		String text = getText(verify1);
		Assert.assertEquals("verify", "The booking has been cancelled.", text);
		System.out.println(text);
	}
	
}
