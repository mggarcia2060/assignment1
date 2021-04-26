package com.meritamerica.assignment1;

public class AccountHolder {
	
	private static String bankName = "MeritAmerica Bank";
	private static String firstName = " John"  ;
	private static String middleName = "James" ;
	private static String lastName = "Doe" ;
	private static String ssn = "123-45-6789";
	private static double checkingAccountOpeningBalance = 100;
	private static double savingsAccountOpeningBalance = 1000;
	
	public AccountHolder() {
		
	}
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		
		
		this.firstName  = firstName;
		this.middleName = middleName;
		this.lastName   =   lastName;
		this.ssn        =        ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		
			
		}
	
	
	
		
	public String getFirstname() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	double getCheckingAccount() {
		return checkingAccountOpeningBalance;
	}
	
	double getSavingsAccount() {
		return savingsAccountOpeningBalance;
	}
	
	

	
	@Override
	public String toString() {
		return "AccountHolder [firstName=" + firstName + ", lastName=" + lastName + ",middleName=" + middleName
				+", ssn=" + ssn + "]";
	}
	
	public static String getOrganizaiton() {
		return bankName;
	}
	
	
	}
	
	
	
	
	
	
		
	}
	