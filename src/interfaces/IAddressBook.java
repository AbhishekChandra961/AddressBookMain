package interfaces;

import exception.InvalidMobileNumberException;
import exception.StartWithCapitalLetterException;
import model.Contacts;

public interface IAddressBook {

	int createContact(Contacts contacts) throws InvalidMobileNumberException, StartWithCapitalLetterException;
	void showAllContacts();
	void search(String firstName);
	void delete(long mobileNo);
	void commit();
	
}
