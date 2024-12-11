package synchronization;

public class Bookthread extends Thread {
	Booking b;
	int seats;
	Bookthread(Booking obj, int seats){
		this.b = obj;
		this.seats = seats;
	}
	public void run() {
		b.bookSeat(seats);
	}
}
