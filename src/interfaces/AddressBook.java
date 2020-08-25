package interfaces;

import java.util.ArrayList;

import addressbook.PersonInfo;

public interface AddressBook {
	public ArrayList<PersonInfo> editPerson(String Filename)  ;
	public ArrayList<PersonInfo> searchPerson(String Filename) throws Throwable;
	public ArrayList<PersonInfo> sortByName(String Filename);
	public ArrayList<PersonInfo> sortByZip(String Filename);
	public void display(String Filename);
	public ArrayList<PersonInfo> deletePerson(String Filename) throws Throwable;
	public ArrayList<PersonInfo> addPerson(String Filename);
}
