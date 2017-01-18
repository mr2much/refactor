package movierental;

public class Main {

	public static void main(String[] args) {
		Movie pirateMovie = new Movie("Pirates of the sand", 0);
		Movie kidsMovie = new Movie("Good Guy Beats Villain", 2);
		Movie newMovie = new Movie("Generic Movie", 1);
		Customer customer = new Customer("Anubis");
		
		Rental rentedPirate = new Rental(pirateMovie, 10);
		//Rental rentedKids = new Rental(kidsMovie, 5);
		//Rental newRental = new Rental(newMovie, 3);
		
		customer.addRental(rentedPirate);
		
		if(performTest(customer, "Rental Record for Anubis\n" +
				"\tPirates of the sand\t14.0\n" + "Amount owed is 14.0\n" + 
				"You earned 1 frequent renter points.")) {
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		}
		
		System.out.println(customer.statement());
		
		//customer.addRental(rentedKids);
		//customer.addRental(newRental);		
	}
	
	public static boolean performTest(Customer customer, String testCase) {
		return customer.statement().equals(testCase);
	}

}
