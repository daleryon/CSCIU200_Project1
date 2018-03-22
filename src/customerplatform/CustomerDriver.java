package customerplatform;

import customerbase.Customer;

public class CustomerDriver {

	public static void main(String[] args) {
		String firstName = "Dale";
		String lastName = "Yon";
		String emailAddress = "dale.yon@zf.com";
		
		Customer customer = new Customer(firstName, lastName, emailAddress);

		// first name and set it
		customer.setFirstName("Dale");
		System.out.println("What is your first name: " + firstName);
		// last name and set it
		customer.setLastName("Yon");
		System.out.println("What is your last name: " + lastName);
		// email address and set it
		customer.setEmailAddress("dale.yon@zf.com");
		System.out.println("What is your email address: " + emailAddress);

	}
}
