package week_6;

import java.util.Calendar;

public class CreditCard {
	
	private int expiryMonth;
	private int expiryYear;
	private String firstName;
	private String lastName;
	private String ccNumber;
	
	public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber) {
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ccNumber = ccNumber;
	}
	
	public String formatExpiryDate() {
		String expYear = Integer.toString(this.expiryYear);
		return this.expiryMonth + "/" + expYear.substring(2);
	}
	
	public String formatFullName() {
		return this.firstName + " " + this.lastName;
	}
	
	public String formatCCNumber() {
		String ccN = this.ccNumber;
		return ccN.substring(0, 4) + " " + ccN.substring(4, 8) + " " + ccN.substring(8, 12) + " " + ccN.substring(12);
	}
	
	public boolean isValid() {
		Calendar now = Calendar.getInstance();
		int month = now.get(Calendar.MONTH) + 1;
		int year = now.get(Calendar.YEAR);
		return (this.expiryYear > year) || (year == this.expiryYear && this.expiryMonth > month);
	}
	
	public String toString() {
		String allCardDetails = String.format("Number: %s\nExpiration date: %s\nAccount holder: %s\nIs valid: %s", formatCCNumber(), 
				formatExpiryDate(), formatFullName(), isValid()); 
		return allCardDetails;
	}
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int month = now.get(Calendar.MONTH);
		int year = now.get(Calendar.YEAR);
		System.out.println(month);
		System.out.println(year);
		
	}
}
