package addressbook;


import java.util.Scanner;

public class AddressBookmainTest {

	
	public static void main(String[] args) throws Throwable {
	ABMImplementation abm=new ABMImplementation();
     Scanner sc=new Scanner(System.in);
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
    	   	System.out.println("two");
    	   	System.out.println("1) Addperson \n"+"2)edit person \n"+"3)delete person \n"+"4)search person \n"+"5)sortByname \n"+"6)sortByzip \n"+"7)display");
    	   	System.out.println("please enter your choice ");
        	int ch1=sc.nextInt();
        	switch (ch1) {
        	case 1:
        	    System.out.println("one");
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


