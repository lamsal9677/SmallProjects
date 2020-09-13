package filetoobjectarray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FiletoObjectArray {
	public static void main(String args[]) {
		MailAddressInterface[] mailingaddress = new MailAddressInterface[100];
		Scanner myscanner;
		try {
			myscanner = new Scanner(new File("res/test.txt") );
			try {
				for (int i= 0; i < 100; i++) {
					String name = myscanner.nextLine();
					String address1 = myscanner.nextLine();
					String address2 = myscanner.nextLine();
					String city = myscanner.nextLine();
					String state = myscanner.nextLine();
					
					int zip = myscanner.nextInt();
					myscanner.nextLine();  // get rid of the rest of the line after the zip code
					
					mailingaddress[i] = new MailAddressInterface(name,address1,address2,city,state,zip);
					//mailingaddress[i].ZipCode
				}
			} catch(NoSuchElementException e) {
				// end of input?
			}
			myscanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);

	}
}
class MailAddressInterface{
	String Name;
	String Address1;
	String Address2;
	String City;
	String State;
	int ZipCode;
	
	MailAddressInterface(String Name, String Address1, String Address2, String City, String State, int ZipCode){
		this.Name = Name;
		this.Address1=Address1;
		this.Address2=Address2;
		this.City=City;
		this.State=State;
		this.ZipCode=ZipCode;
	}
}
