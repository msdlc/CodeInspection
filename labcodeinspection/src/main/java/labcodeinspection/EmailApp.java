package labcodeinspection;

import java.io.IOException
;
import java.util.*;
import java.util.logging.*;

import com.sun.tools.javac.launcher.Main;

/**
* 
*
* @author Mary S.
*/
public final class EmailApp {
	
	private EmailApp() {
        throw new java.lang.UnsupportedOperationException("");
    }
	/**
	* 
	*
	* @author Mary S.
	*/
	public static void main(String[] args) throws IOException {
		Logger log = Logger.getLogger(Main.class.getName());
		
		Scanner sc = new Scanner(System.in);
		
			log.fine("\"Enter your first name:\"");
			String firstName = sc.nextLine();
			log.fine("Enter your last name: ");
			String lastName = sc.nextLine();
			log.fine("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");
			int depChoice = sc.nextInt();
			sc.close();
			Email email = new Email(firstName, lastName);
			email.setDeparment(depChoice);
			email.generateEmail();
			email.showInfo();
			
		
	}
}
