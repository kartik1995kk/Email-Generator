package emailapp;
import java.util.Scanner;
public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String CompanySuffix = "anycompany.com";
	
	//Constructor to recieve the frst and last name
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		
		//Call a method asking for the department + return the department
		this.department=setDepartment();
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password:" + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+CompanySuffix;
	}
	//Ask for department
	private String setDepartment() {
		System.out.println("New worker:"+firstName+"\nDEPARTMENT CODEs:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "dev";}
		else if(depChoice==3) {return "acct";}
		else {return "";}
	}
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmonpqrstuvwxyz0123456789!@#$%^&*()";
		char[] password = new char[length];
		for(int i=0;i<length;i++){
			int rand = (int)(Math.random()*passwordSet.length());
			password[i]= passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//Set the mailbox Capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	//Set alternate email
	public void setAlternateEmail(String altmail) {
		this.alternateEmail=altmail;
	}
	//Change the password	
	public void ChangePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME:" + firstName+" "+lastName+
				"\nCOMPANY EMAIL:" + email+
				"\nMAILBOX CAPACITY:" + mailboxCapacity + "mb";
	}
}

