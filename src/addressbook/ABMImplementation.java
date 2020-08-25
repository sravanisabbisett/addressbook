package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

import interfaces.AddressBookManagerInterface;

public class ABMImplementation implements AddressBookManagerInterface {
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	int zipcode;
	String phonenumber;
	Scanner sc=new Scanner(System.in);
	//PersonInfo person;
	ReadWrite RW=new ReadWrite();
	@Override
	public void newAddressBook() {
		ArrayList<PersonInfo> personarraylist=new ArrayList<PersonInfo>();
		System.out.println("create a file with .csv extension");
		String Filename=sc.next();
		System.out.println("please enter the no of persons to add");
		int noofpersons=sc.nextInt();
		for(int i=1;i<=noofpersons;i++) {
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
			
		   personarraylist.add(new PersonInfo(firstname,lastname,address,city,state,zipcode,phonenumber));
		   try {
			RW.Writecsv(Filename, personarraylist);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
		}
		
	

	@Override
	public void openAddressBook() {
		RW.showfiles();
		
	}

	@Override
	public void saveAddressBook(String Filename, ArrayList<PersonInfo> save) {
		try {
			RW.Writecsv(Filename, save);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void saveAsAddressBook(String oldfile, String newfile) throws Throwable {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAddressBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quitAddressBook() {
		// TODO Auto-generated method stub
		
	}

	
}
