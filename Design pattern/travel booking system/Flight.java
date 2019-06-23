package package1.Booking;

public class Flight extends TravelBookings {
	static int booking_id;
	public void personal_info() {
		System.out.println("Calls personal info method for Flight");
	}
	public void travel_info() {
		System.out.println("Calls travel info method for Flight");
	}
	public void payment() {
		System.out.println("Calls payment info method for Flight");
	}
	public void confirmation() {
		booking_id++;
		System.out.println("Your FLIGHT ticket has been confirmed with BOOKING ID="+booking_id);	
	}
}
