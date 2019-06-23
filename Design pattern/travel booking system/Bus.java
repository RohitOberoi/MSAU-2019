package package1.Booking;

public class Bus extends TravelBookings{
	static int booking_id;
	public void personal_info() {
		System.out.println("Calls personal info method for BUS");
	}
	public void travel_info() {
		System.out.println("Calls travelling info method for BUS");
	}
	public void payment() {
		System.out.println("Calls payment method for BUS");
	}
	public void confirmation() {
		booking_id++;
		System.out.println("Your BUS ticket has been confirmed with BOOKING ID="+booking_id);
		
	}
}
