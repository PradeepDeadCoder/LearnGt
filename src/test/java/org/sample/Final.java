package org.sample;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Final extends BaseClass {

	
	@BeforeClass
	private void beforeClass() throws InterruptedException {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		waitUrl();
	}
	
	@AfterClass
	private void afterClass() {
		closeBrowser();
	}
	
	@Test
	private void runUrl() throws IOException {
		
				//Login
				LoginPage loginPage = new LoginPage();
				loginPage.login(getData("Data", 1, 0), getData("Data", 1, 1));
				
				
				//SearchHotel
				
				SearchHotelPage searchHotelPage = new SearchHotelPage();
				searchHotelPage.searchHotel(getData("Data", 1, 2), getData("Data", 1, 3), getData("Data", 1, 4), getData("Data", 1, 5), getData("Data", 1, 6), getData("Data", 1, 7));
				
				
				//SelectHotel
				
				SelectHotel selectHotel = new SelectHotel();
				selectHotel.selectHotel();
				
				//BookAHotel
				BookAHotel bookAHotel = new BookAHotel();
				bookAHotel.bookHotel(getData("Data", 1, 8), getData("Data", 1, 9), getData("Data", 1, 10), getData("Data",1, 11), getData("Data", 1, 12), getData("Data", 1, 13), getData("Data", 1, 14), getData("Data", 1, 15));
				
				//BookingConfirmation
				BookingConfirmation bookingConfirmation= new BookingConfirmation();
				bookingConfirmation.bookingConfirmation("D:\\PRADEEP\\Excel\\Adactinhotel.xlsx", "Data", 1, 16);
				
				
				//BookedItinerary
				
				BookedItinerary bookedItinerary = new BookedItinerary();
				bookedItinerary.cancelBooking(getData("Data", 1, 16));
				
		
	}
}
