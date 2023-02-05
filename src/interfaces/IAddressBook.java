package interfaces;

import model.Contacts;
public interface IAddressBook {
	
	int createContact(Contacts contacts);
	void showAllContacts();
	void deleteContacts(String firstName);
	void updateContacts(String firstName);
}
