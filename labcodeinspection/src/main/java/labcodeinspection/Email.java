package labcodeinspection;
import java.util.*;
import java.util.logging.Logger;

/**
* 
*
* @author Mary S.
*/
public class Email {
	/**
	*
	*/
	private final transient String m_firstName;
	/**
	*
	*/
	private final transient String m_lastName;
	/**
	*
	*/
	private transient String password;
	/**
	*
	*/
	private transient String department;
	/**
	*
	*/
	private final static transient int defaultpasswordLength = 8;
	/**
	*
	*/
	private transient String m_email;
	/**
	* 
	*
	* @author Mary S.
	*/
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}
	/**
	* 
	*
	* @author Mary S.
	*/
	public void showInfo() {
		Logger.getLogger("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		Logger.getLogger("DEPARMENT= " + department + "\nEMAIL= " + m_email + "\nPASSWORD= " + password);
	}
	/**
	* 
	*
	* @author Mary S.
	*/
	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	/**
	* 
	*
	* @author Mary S.
	*/
	public void generateEmail() {
		this.password = this.randomPassword(defaultpasswordLength);
		this.m_email = this.m_firstName.toLowerCase(Locale.getDefault()) + this.m_lastName.toLowerCase(Locale.getDefault()) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
