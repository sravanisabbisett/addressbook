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
	String zipcode;
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
		zipcode=sc.next();
		System.out.println("Enter mobilenumber");
		phonenumber=sc.next();
		if(phonenumber.matches("\\d{10}")&&(zipcode.matches("^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$"))&&(firstname.matches("[A-Z][a-z]*"))&&(lastname.matches("[A-Z][a-z]*"))) {
		person.add(new PersonInfo(firstname,lastname,address,city,state,zipcode,phonenumber));
	    System.out.println("size of an array list after adding person"+person.size());
		}
		else
		{
			System.out.println("please enter valid phone number and zip");
		}
		}
	
	return person;
		
	}
	@Override
	public ArrayList<PersonInfo> editPerson(String Filename) {
		ArrayList<PersonInfo> editperson = null;
		try {
			editperson = RW.Readcsv(Filename);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter your edit person details");
		String search =sc.next();
		for(int i=0; i<editperson.size();i++) {
			String fsearch=editperson.get(i).getphonenumber();
			if(search.equalsIgnoreCase(fsearch)) {
				System.out.println("Enter firstname: ");
				firstname=sc.next();
				System.out.println("Enter lastname:");
				lastname=sc.next();
				System.out.println("Enter address:");
				address=sc.next();
				System.out.println("Enter city:");
				city=sc.next();
				System.out.println("Enter state");
				state=sc.next();
				System.out.println("Enter zipcode:");
				zipcode=sc.next();
				System.out.println("Enter phone number:");
				phonenumber=sc.next();
				if(phonenumber.matches("\\d{10}")&&(zipcode.matches("^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$"))&&(firstname.matches("[A-Z][a-z]*"))&&(lastname.matches("[A-Z][a-z]*"))) {
				PersonInfo edit=editperson.set(i, (new PersonInfo(firstname,lastname,address,city,state,zipcode,phonenumber)));
                System.out.println(edit);
				System.out.println(editperson.get(i));
				}
				else {
					System.out.println("please enter valid phonenumber,zip,firstnameand lastname");
				}
			}
			
		}
		return editperson;
	}
	@Override
	public ArrayList<PersonInfo> deletePerson(String Filename) throws Throwable {
		ArrayList<PersonInfo> delPerson=RW.Readcsv(Filename);
		System.out.println("Enter the delete person phone number");
		String search=sc.next();
		System.out.println("size of an array list before deleting"+delPerson.size());
		for(int i=0;i<delPerson.size();i++) {
			if(search.equalsIgnoreCase(delPerson.get(i).getphonenumber())) {
				System.out.println(delPerson.get(i));
				delPerson.remove(i);
				System.out.println("size of an array list after deleting"+delPerson.size());
				
				
			}
		}
		return delPerson;
	}
	@Override
	public ArrayList<PersonInfo> searchPerson(String Filename) throws Throwable {
		ArrayList<PersonInfo> person=RW.Readcsv(Filename);
		  System.out.println("Enter the phone number to search");
		  String search=sc.next();
		  for(int i=0;i<person.size();i++) {
			  if(search.equalsIgnoreCase(person.get(i).getphonenumber())) {
			     System.out.println(person.get(i));
				  
			  }
			  
		  }
		  
			return person;
	}
	@Override
	public ArrayList<PersonInfo> sortByName(String Filename) {
		ArrayList<PersonInfo> sortByname=null;
		try {
			sortByname = RW.Readcsv(Filename);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Collections.sort(sortByname,(o1,o2) ->o1.getfname().compareToIgnoreCase(o2.getfname()));
		for(PersonInfo p:sortByname) {
			System.out.println(p.toString());
		}
		
		return sortByname;
	}
	@Override
	public ArrayList<PersonInfo> sortByZip(String Filename) {
		ArrayList<PersonInfo> personarraylist=null;
		try {
			personarraylist = RW.Readcsv(Filename);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Comparator<PersonInfo> personzipComparator=Comparator.comparing(PersonInfo :: getzip);
	    Collections.sort(personarraylist,personzipComparator);
	    for(PersonInfo p:personarraylist) {
	    	System.out.println(p.toString());
	    }
	    return personarraylist;
	}
	@Override
	public void display(String Filename) {
		ArrayList<PersonInfo> adbook = null;
		try {
		adbook=RW.Readcsv(Filename);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(PersonInfo p: adbook) {
			System.out.println(p.toString());
		}
		
	}

	

}