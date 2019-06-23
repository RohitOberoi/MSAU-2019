package package1.Booking;

import java.util.Scanner;

public class Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the mode of travelling");
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		if(s.equals("Bus")) {
			Bus obj1=new Bus();
			obj1.fun();
		}
		else if(s.equals("Train")) {
			Train obj1=new Train();
			obj1.fun();
		}
		else if(s.equals("Flight")) {
			Flight obj1=new Flight();
			obj1.fun();
		}
			
	}

}
