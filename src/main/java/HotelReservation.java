import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.hotel;

public class HotelReservation {
	hotel lakewood = new hotel("Lakewood", 3, 110, 90, 80, 80);
	hotel bridgewood = new hotel("Bridgewood", 4, 160, 60, 110, 50);
	hotel ridgewood = new hotel("Ridgewood", 5, 220, 150, 100, 40);
	DateTimeFormatter df = DateTimeFormatter.ofPattern("dMMMyyyy", Locale.ENGLISH);
    
	public String getCheapestHotel (String input) {
    	String[] inputSplit = input.split(" ");
    	List<String> inputList = Arrays.asList(inputSplit);
    	String hotel = "";
    	
    	 String dOne = inputList.get(1).replaceAll("\\(.*\\),*", "");
    	 String dTwo = inputList.get(2).replaceAll("\\(.*\\),*", "");
    	 String dThree = inputList.get(3).replaceAll("\\(.*\\),*", "");
    	 
    	 LocalDate dateOne = LocalDate.parse(dOne, df);
    	 LocalDate dateTwo = LocalDate.parse(dTwo, df);
    	 LocalDate dateThree = LocalDate.parse(dThree, df);
    	 
    	 DayOfWeek dayOne = dateOne.getDayOfWeek();
    	 DayOfWeek dayTwo = dateTwo.getDayOfWeek();
    	 DayOfWeek dayThree = dateThree.getDayOfWeek();
    	
    	if (inputList.contains("Regular:"))
    		hotel = comparationRegularPrice(dayOne, dayTwo, dayThree);
    	else
    		hotel = comparationRewardPrice(dayOne, dayTwo, dayThree);
    	
    	
        return hotel;
    }

	private String comparationRewardPrice(DayOfWeek dayOne, DayOfWeek dayTwo, DayOfWeek dayThree) {
		int lakewoodPrice = Price(dayOne, dayTwo, dayThree, lakewood.getRewardWeekdayPrice(), lakewood.getRewardWeekendPrice());
		int bridgePrice = Price(dayOne, dayTwo, dayThree, bridgewood.getRewardWeekdayPrice(), bridgewood.getRewardWeekendPrice());
		int ridgewoodPrice = Price(dayOne, dayTwo, dayThree, ridgewood.getRewardWeekdayPrice(), ridgewood.getRewardWeekendPrice());
		String hotel = "";
		if(lakewoodPrice < bridgePrice){
			if(lakewoodPrice == ridgewoodPrice)
				if(lakewood.getRank()> ridgewood.getRank())
					hotel = "Lakewood";
				else
					hotel = "Ridgewood";
		}
			
		else if(ridgewoodPrice < bridgePrice) {
			if(ridgewoodPrice == bridgePrice)
				if(ridgewood.getRank() > bridgewood.getRank())
					hotel = "Ridgewood";
				else
					hotel = "Bridgewood";
		}	
			
		else
			hotel = "Bridgewood";
		
		return hotel;
		
	}

	

	private String comparationRegularPrice(DayOfWeek dayOne, DayOfWeek dayTwo, DayOfWeek dayThree) {
		int lakewoodPrice = Price(dayOne, dayTwo, dayThree, lakewood.getRegularWeekdayPrice(), lakewood.getRegularWeekendPrice());
		int bridgePrice = Price(dayOne, dayTwo, dayThree, bridgewood.getRegularWeekdayPrice(), bridgewood.getRegularWeekendPrice());
		int ridgewoodPrice = Price(dayOne, dayTwo, dayThree, ridgewood.getRegularWeekdayPrice(), ridgewood.getRegularWeekendPrice());
		String hotel = "";
		if(lakewoodPrice < bridgePrice){
			if(lakewoodPrice == ridgewoodPrice)
				if(lakewood.getRank()> ridgewood.getRank())
					hotel = "Lakewood";
				else
					hotel = "Ridgewood";
		}
			
		else if(ridgewoodPrice < bridgePrice) {
			if(ridgewoodPrice == bridgePrice)
				if(ridgewood.getRank() > bridgewood.getRank())
					hotel = "Ridgewood";
				else
					hotel = "Bridgewood";
		}	
			
		else
			hotel = "Bridgewood";
		
		return hotel;
		
		
		
	}
	
	private int Price(DayOfWeek dayOne, DayOfWeek dayTwo, DayOfWeek dayThree, Integer weekdayPrice,
			Integer weekendPrice) {
		int price = 0;
		  
		if(dayOne == DayOfWeek.SATURDAY || dayOne == DayOfWeek.SUNDAY)
			  price += weekendPrice;
		  else
			  price += weekdayPrice;
		
		if(dayTwo == DayOfWeek.SATURDAY || dayTwo == DayOfWeek.SUNDAY)
			  price += weekendPrice;
		  else
			  price += weekdayPrice;
		
		if(dayThree == DayOfWeek.SATURDAY || dayThree == DayOfWeek.SUNDAY)
			  price += weekendPrice;
		  else
			  price += weekdayPrice;
		
		return price;
		
	}

}
