package org.sample;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel extends BaseClass {

	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement verify;
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(name="cc_num")
	private WebElement txtCcNum;
	
	@FindBy(id="cc_type")
	private WebElement txtCcType;
	
	@FindBy(id="cc_exp_month")
	private WebElement txtExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement txtCcYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCcCvv;
	
	@FindBy(id="book_now")
	private WebElement btnClick;

	public WebElement getVerify() {
		return verify;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCcNum() {
		return txtCcNum;
	}

	public WebElement getTxtCcType() {
		return txtCcType;
	}

	public WebElement getTxtExpMonth() {
		return txtExpMonth;
	}

	public WebElement getTxtCcYear() {
		return txtCcYear;
	}

	public WebElement getTxtCcCvv() {
		return txtCcCvv;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
	
	public void verifyBookHotel() {
		String text = getText(verify);
		Assert.assertEquals("verify", "Book A Hotel", text);
		System.out.println(text);

	}
	
	
	public void bookHotel(String firstName, String lastName, String address, String cardNo, String cardType, String expiryMonth, String expiryYear, String cvv) {
		type(txtFirstName, firstName);
		type(txtLastName, lastName);
		type(txtAddress, address);
		type(txtCcNum, cardNo);
		type(txtCcType, cardType);
		type(txtExpMonth, expiryMonth);
		type(txtCcYear, expiryYear);
		type(txtCcCvv, cvv);
		click(btnClick);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
