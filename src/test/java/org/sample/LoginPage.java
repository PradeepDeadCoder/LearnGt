package org.sample;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement verifyText;
	
	public WebElement getVerifyText() {
		return verifyText;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void login(String userName, String password) {
		
		type(getTxtUserName(), userName);
		type(getTxtPassword(), password);
		click(btnLogin);
	}
	
	public void verifyHomePageText() {
		String text = getText(verifyText);
		Assert.assertEquals("verify", "Existing User Login - Build 1", text);
		System.out.println(text);
	}
	
	
	
	
	
	
	
	
}
