package customerplatform;

import customerbase.Customer;

public class CustomerDriver {

	public static void main(String[] args) {
		// Create the Customer class to support the
		// methods used below.
		Customer customer = new Customer("firstName", "lastName", "emailAddress");

		// should prompt for first name and set it
		customer.setFirstName("Dale");
		// should prompt for last name and set it
		customer.setLastName("Yon");
		// should prompt for email address and set it
		customer.setEmailAddress("dale.yon@zf.com");
	}
}
