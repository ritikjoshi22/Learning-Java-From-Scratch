package synchronization;

public class Main {

	public static void main(String[] args) {
		Booking b = new Booking();
		Bookthread t1 = new Bookthread(b,13);
		Bookthread t2 = new Bookthread(b,15);
		t1.start();
		t2.start();
	}

}
