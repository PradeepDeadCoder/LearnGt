package org.sample;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchHotelPage extends BaseClass{

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="location")
	private WebElement dDnLocation;
	
	@FindBy(id="hotels")
	private WebElement dDnHotel;
	
	@FindBy (id="room_type")
	private WebElement dDnRoomType;
	
	@FindBy(id="room_nos")
	private WebElement dDnNoOfRooms;
	
	@FindBy(id="adult_room")
	private WebElement dDnAdultPerRoom;
	
	@FindBy(name="child_room")
	private WebElement dDnChilderPerRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;
	
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement verify;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotel() {
		return dDnHotel;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}

	public WebElement getdDnAdultPerRoom() {
		return dDnAdultPerRoom;
	}

	public WebElement getdDnChilderPerRoom() {
		return dDnChilderPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getVerify() {
		return verify;
	}
	

	public void verifySearchHotel() {
		String text = getText(verify);
		Assert.assertEquals("verify", "Search Hotel (Fields marked with Red asterix (*) are mandatory)", text);
		System.out.println(text);
	}
	
	public void searchHotel(String location, String hotel, String roomType, String noOfRooms, String adultPerRoom, String childernPerRoom) {
		type(dDnLocation, location);
		type(dDnHotel, hotel);
		type(dDnRoomType, roomType);
		type(dDnNoOfRooms, noOfRooms);
		type(dDnAdultPerRoom, adultPerRoom);
		type(dDnChilderPerRoom, childernPerRoom);
		click(btnSearch);
		
	
	}
	
	

}
