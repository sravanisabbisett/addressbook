package addressbook;


import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookmainTest {

	
	public static void main(String[] args) throws Throwable {
		Scanner sc=new Scanner(System.in);
		ABimplementation ab=new ABimplementation();
		ABMImplementation abm=new ABMImplementation();
		ArrayList<PersonInfo> arraylist=new ArrayList<PersonInfo>();
		ReadWrite RW=new ReadWrite();
        boolean i=true;
         
     while(i) {   	 
      
        System.out.println("1) new address book \n"+"2) openaddress book  \n"
        +"3) saveAddressBook\n"+"4) saveAsAddressBook\n"+"5) close AddressBook\n"+"6) Quit AddressBook");
        
        System.out.println("please enter your choice");
        int number=sc.nextInt();
       switch (number) {
       case 1:
    	   abm.newAddressBook();
    	   break;
       case 2:
    	    abm.openAddressBook();
   	   	    System.out.println("Enter the file name to open");
   	   	    String Filename=sc.next();
    	   	System.out.println("1) Addperson \n"+"2)edit person \n"+"3)delete person \n"+"4)search person \n"+"5)sortByname \n"+"6)sortByzip \n"+"7)display");
    	   	System.out.println("please enter your choice ");
        	int ch1=sc.nextInt();
        	switch (ch1) {
        	case 1:
        		arraylist=ab.addPerson(Filename);
        		break;
        	case 2:
        		System.out.println("two");
        		break;
        	case 3:
        		System.out.println("three");
        		break;
        	case 4:
        		System.out.println("four");
        		break;
        	case 5:
        		System.out.println("five");
        		break;
        	case 6:
                System.out.println("six");
        		break;
        	case 7:
        		System.out.println("seven");
        		break;
        	}
        	break;
       case 3:
    	   RW.showfiles();
    	   System.out.println("please select the file u want to save");
    	   Filename=sc.next();
    	   abm.saveAddressBook(Filename, arraylist);
    	   
    	   break;
       case 4:
 	        System.out.println("four");
 	        break;
       case 5:
    	   System.out.println("five");
    	   break;
       case 6:
    	   System.out.println("six");
    	   break; 
    	default:
    		System.out.println("please enter details");
       }
       System.out.println("do you want to continue(Y/N)?");
       String var=sc.next();
       if(var.equalsIgnoreCase("y")) {
    	   continue;
       }
       else {
    	   break;
       }
        
	}
	sc.close();

		
	}
	
	}


