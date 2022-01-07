package org.sample;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

public class FinalBook extends BaseClass {

	@BeforeClass
	public static void beforeClass() throws InterruptedException {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		waitUrl();
	}
	
	@Test
	public void booking() throws IOException, InterruptedException {
		
		//Login
		LoginPage loginPage = new LoginPage();
		loginPage.verifyHomePageText();
		loginPage.login(getData("Data", 1, 0), getData("Data", 1, 1));
		
		
		//SearchHotel
		
		SearchHotelPage searchHotelPage = new SearchHotelPage();
		searchHotelPage.verifySearchHotel();
		searchHotelPage.searchHotel(getData("Data", 1, 2), getData("Data", 1, 3), getData("Data", 1, 4), getData("Data", 1, 5), getData("Data", 1, 6), getData("Data", 1, 7));
		
		
		//SelectHotel
		
		SelectHotel selectHotel = new SelectHotel();
		selectHotel.verifySelectHotel();
		selectHotel.selectHotel();
		
		//BookAHotel
		BookAHotel bookAHotel = new BookAHotel();
		bookAHotel.verifyBookHotel();
		bookAHotel.bookHotel(getData("Data", 1, 8), getData("Data", 1, 9), getData("Data", 1, 10), getData("Data",1, 11), getData("Data", 1, 12), getData("Data", 1, 13), getData("Data", 1, 14), getData("Data", 1, 15));
		
		//BookingConfirmation
		BookingConfirmation bookingConfirmation= new BookingConfirmation();
		bookingConfirmation.bookingConfirmation("D:\\PRADEEP\\Excel\\Adactinhotel.xlsx", "Data", 1, 16);
		
		
		//BookedItinerary
		
		BookedItinerary bookedItinerary = new BookedItinerary();
		bookedItinerary.verifyBookedItinerary();
		bookedItinerary.cancelBooking(getData("Data", 1, 16));
		bookedItinerary.verifyLast();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
