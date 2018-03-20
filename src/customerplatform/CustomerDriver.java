package customerplatform;

import customerbase.Customer;

public class CustomerDriver {

	public static void main(String[] args) {
		// Create the Customer class to support the
		// methods used below.
		Customer customer = new Customer("firstName", "lastName", "emailAddress");

		// first name and set it
		customer.setFirstName("Dale");
		// last name and set it
		customer.setLastName("Yon");
		// email address and set it
		customer.setEmailAddress("dale.yon@zf.com");

		// Prior to Stage 3 of Project, each of the above will prompt and set
	}
}
