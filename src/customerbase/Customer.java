package customerbase;

public class Customer {
	private String firstName;
	private String lastName;
	private String emailAddress;

	public Customer(String firstName, String lastName, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println("What is your first name: " + firstName);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		System.out.println("What is your last name: " + lastName);
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("What is your email address: " + emailAddress);
	}

	public String toString() {
		return firstName + " " + lastName + " " + emailAddress;
	}

}
