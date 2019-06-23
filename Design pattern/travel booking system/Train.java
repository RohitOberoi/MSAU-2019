package package1.Booking;

public class Train extends TravelBookings{
	static int booking_id;
	public void personal_info() {
		System.out.println("Calls personal info method for Train");
	}
	public void travel_info() {
		System.out.println("Calls travelling details method method for Train");
	}
	public void payment() {
		System.out.println("Calls payment method for Train");
		}
	public void confirmation() {
		booking_id++;
		System.out.println("Your TRAIN ticket has been confirmed with BOOKING ID="+booking_id);
		
	}
}
