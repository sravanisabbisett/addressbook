package interfaces;

import java.util.ArrayList;

import addressbook.PersonInfo;

public interface AddressBookManagerInterface {
	
	public void newAddressBook();
	public void openAddressBook();
	public void saveAddressBook(String Filename,ArrayList<PersonInfo> save);
	public void saveAsAddressBook(String oldfile,String newfile) throws Throwable;
	public void closeAddressBook(String Filename);
	public void quitAddressBook();
	
}
