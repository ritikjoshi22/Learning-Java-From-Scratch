package synchronization;

public class Booking {
	int total = 20;
	public synchronized void bookSeat(int seats) {
		if(seats <= total) {
			System.out.println("Seats booked="+seats);
			total -= seats;
		}
		else {
			System.out.println("Not enough Seats");
		}
	}
}
