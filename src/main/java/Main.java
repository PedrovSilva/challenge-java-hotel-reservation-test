import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 HotelReservation hotelReservation = new HotelReservation();
		 Scanner sc = new Scanner(System.in);
		 
		 String input = sc.nextLine();
		 
		 System.out.println(hotelReservation.getCheapestHotel(input));
	 }

}
