package addressbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import interfaces.AddressBook; 
public class ABimplementation implements AddressBook  {
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	int zipcode;
	String phonenumber;
	Scanner sc=new Scanner(System.in);
	ArrayList<PersonInfo> personarraylist=new ArrayList<PersonInfo>();
	PersonInfo person;
	ReadWrite RW=new ReadWrite();
	@Override
	public ArrayList<PersonInfo> addPerson(String Filename) {
		ArrayList<PersonInfo> person=null;
		try {
			person = RW.Readcsv(Filename);
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("please enter the number of persons to add");
		int number=sc.nextInt();
		for(int i=0;i<number;i++) {
		System.out.println("Enter Firstname :");
		firstname=sc.next();
		System.out.println("Enter Lastname :");
		lastname=sc.next();
		System.out.println("Enter address:");
		address=sc.next();
		System.out.println("Enter city:");
		city=sc.next();
		System.out.println("Enter state:");
		state=sc.next();
		System.out.println("Enter zipcode:");
		zipcode=sc.nextInt();
		System.out.println("Enter mobilenumber");
		phonenumber=sc.next();
		person.add(new PersonInfo(firstname,lastname,address,city,state,zipcode,phonenumber));
	    System.out.println("size of an array list after adding person"+person.size());
		
		}
	
	return person;
		
	}
	@Override
	public ArrayList<PersonInfo> editPerson(String Filename) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<PersonInfo> deletePerson(String Filename) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<PersonInfo> searchPerson(String Filename) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<PersonInfo> sortByName(String Filename) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<PersonInfo> sortByZip(String Filename) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void display(String Filename) {
		// TODO Auto-generated method stub
		
	}

	

}