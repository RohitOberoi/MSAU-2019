package package1.Booking;

public abstract class TravelBookings {
	abstract void personal_info();
	abstract void travel_info();
	abstract void payment();
	abstract void confirmation();
	
	public final void fun()
	{
		personal_info();
		travel_info();
		payment();
		confirmation();
	}
}
