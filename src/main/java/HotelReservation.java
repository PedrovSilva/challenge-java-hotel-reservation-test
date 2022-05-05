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
    	
    	 String dOne = inputList.get(1).replaceAll("\\(.*\\),*", "");
    	 String dTwo = inputList.get(1).replaceAll("\\(.*\\),*", "");
    	 String dThree = inputList.get(1).replaceAll("\\(.*\\),*", "");
    	 
    	 LocalDate dateOne = LocalDate.parse(dOne, df);
    	 LocalDate dateTwo = LocalDate.parse(dTwo, df);
    	 LocalDate dateThree = LocalDate.parse(dThree, df);
    	 
    	 DayOfWeek dayOne = dateOne.getDayOfWeek();
    	 DayOfWeek dayTwo = dateTwo.getDayOfWeek();
    	 DayOfWeek dayThree = dateThree.getDayOfWeek();
    	
    	if (inputList.contains("Regular:"))
    		regularPrice(dayOne, dayTwo, dayThree);
    	else
    		rewardPrice(dayOne, dayTwo, dayThree);
    	
    	
        return "Cheapest hotel name";
    }

	private String rewardPrice(DayOfWeek dayOne, DayOfWeek dayTwo, DayOfWeek dayThree) {
		if(dayOne == DayOfWeek.SATURDAY ||dayOne == DayOfWeek.SUNDAY)
			weekendPrice(lakewood.getRewardWeekendPrice(), bridgewood.getRewardWeekendPrice(), ridgewood.getRewardWeekendPrice());
		else
			weekdayPrice(lakewood.getRewardWeekdayPrice(), bridgewood.getRewardWeekdayPrice(), ridgewood.getRewardWeekdayPrice());
		
		if(dayTwo == DayOfWeek.SATURDAY ||dayTwo == DayOfWeek.SUNDAY)
			weekendPrice(lakewood.getRewardWeekendPrice(), bridgewood.getRewardWeekendPrice(), ridgewood.getRewardWeekendPrice());
		else
			weekdayPrice(lakewood.getRewardWeekdayPrice(), bridgewood.getRewardWeekdayPrice(), ridgewood.getRewardWeekdayPrice());
		
		if(dayThree == DayOfWeek.SATURDAY ||dayThree == DayOfWeek.SUNDAY)
			weekendPrice(lakewood.getRewardWeekendPrice(), bridgewood.getRewardWeekendPrice(), ridgewood.getRewardWeekendPrice());
		else
			weekdayPrice(lakewood.getRewardWeekdayPrice(), bridgewood.getRewardWeekdayPrice(), ridgewood.getRewardWeekdayPrice());
		
		return null;
	}

	private String regularPrice(DayOfWeek dayOne, DayOfWeek dayTwo, DayOfWeek dayThree) {
		
		
		if(dayOne == DayOfWeek.SATURDAY ||dayOne == DayOfWeek.SUNDAY)
			weekendPrice(lakewood.getRewardWeekendPrice(), bridgewood.getRewardWeekendPrice(), ridgewood.getRewardWeekendPrice());
		else
			weekdayPrice(lakewood.getRewardWeekdayPrice(), bridgewood.getRewardWeekdayPrice(), ridgewood.getRewardWeekdayPrice());
		
		if(dayTwo == DayOfWeek.SATURDAY ||dayTwo == DayOfWeek.SUNDAY)
			weekendPrice(lakewood.getRewardWeekendPrice(), bridgewood.getRewardWeekendPrice(), ridgewood.getRewardWeekendPrice());
		else
			weekdayPrice(lakewood.getRewardWeekdayPrice(), bridgewood.getRewardWeekdayPrice(), ridgewood.getRewardWeekdayPrice());
		
		if(dayThree == DayOfWeek.SATURDAY ||dayThree == DayOfWeek.SUNDAY)
			weekendPrice(lakewood.getRewardWeekendPrice(), bridgewood.getRewardWeekendPrice(), ridgewood.getRewardWeekendPrice());
		else
			weekdayPrice(lakewood.getRewardWeekdayPrice(), bridgewood.getRewardWeekdayPrice(), ridgewood.getRewardWeekdayPrice());
		
		return null;
	}

	private Integer weekdayPrice(Integer rewardWeekdayPrice, Integer rewardWeekdayPrice2, Integer rewardWeekdayPrice3) {
		
	
		
		return rewardWeekdayPrice3;
		
		
		
	}

	private Integer weekendPrice(Integer rewardWeekendPrice, Integer rewardWeekendPrice2, Integer rewardWeekendPrice3) {
	
		
		return rewardWeekendPrice3;
		
		
	}
}
