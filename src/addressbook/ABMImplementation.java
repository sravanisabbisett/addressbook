package addressbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Scanner;

import interfaces.AddressBookManagerInterface;

public class ABMImplementation implements AddressBookManagerInterface {
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	String zipcode;
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
			zipcode=sc.next();
			System.out.println("Enter mobilenumber");
			phonenumber=sc.next();
			if(phonenumber.matches("\\d{10}")&&(zipcode.matches("^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$"))&&(firstname.matches("[A-Z][a-z]*"))&&(lastname.matches("[A-Z][a-z]*"))) {
		   personarraylist.add(new PersonInfo(firstname,lastname,address,city,state,zipcode,phonenumber));
		   try {
			RW.Writecsv(Filename, personarraylist);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		String path1="C:\\Users\\PC\\eclipse-workspace\\addressbook\\src\\"+oldfile;
		String path2="C:\\Users\\PC\\eclipse-workspace\\addressbook\\src\\"+newfile;
		File oldName = new File(path1); 
		File newName =  new File(path2);
		FileInputStream inputStream = new FileInputStream(oldName);
	    FileChannel inChannel = inputStream.getChannel();
	 
	    
	    FileOutputStream outputStream = new FileOutputStream(newName);
	    FileChannel outChannel = outputStream.getChannel();
	 
	    inChannel.transferTo(0, oldName.length(), outChannel);
	 
	    inputStream.close();
	    outputStream.close();
		
			
		
	}
    @Override
	public void closeAddressBook(String Filename) {

		
	}

	@Override
	public void quitAddressBook() {
		System.exit(0);
		
	}

	
}
