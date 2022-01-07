package org.sample;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass{

	public SelectHotel() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//td[@class='login_title']")
	private WebElement verify;
	
	@FindBy(id="radiobutton_0")
	private WebElement btnRadiobuton;
	
	@FindBy(name="continue")
	private WebElement btnContinue;

	public WebElement getVerify() {
		return verify;
	}

	public WebElement getBtnRadiobuton() {
		return btnRadiobuton;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	public void verifySelectHotel() {
		String text = getText(verify);
		Assert.assertEquals("verify", "Select Hotel", text);
		System.out.println(text);
	}
	public void selectHotel() {
		click(btnRadiobuton);
		click(btnContinue);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
