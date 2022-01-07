package org.sample;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClass {
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement getOrderId;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement btnSearch;
	
	
	
	
	
	public WebElement getGetOrderId() {
		return getOrderId;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void bookingConfirmation(String path, String sheetName, int rowNo, int cellNo) throws IOException {
		String text1 = getAttributeValue(getOrderId);
		outData(path, sheetName, rowNo, cellNo, text1);
		click(btnSearch);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
