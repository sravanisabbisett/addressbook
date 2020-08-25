package addressbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Objects;

import com.opencsv.CSVWriter;

public class ReadWrite {
	public void Writecsv(String Filename,ArrayList<PersonInfo> addressbook) throws Throwable {
		String path="C:\\Users\\PC\\eclipse-workspace\\addressbook\\src\\"+Filename;
		CSVWriter writer=new CSVWriter(new FileWriter(path));
		String line1[]= {"Firstname","Lastname","address","city","state","zip","mobilenumber"};
		writer.writeNext(line1);
		for(int i=0;i<addressbook.size();i++) {
			PersonInfo index=addressbook.get(i);
		String line2[]= {index.getfname(),index.getlname(),index.getAddress(),index.getCity(),index.getstate(),Integer.toString(index.getzip()),String.valueOf(index.getphonenumber())};
		writer.writeNext(line2);

		}
		writer.flush();
		
	
	}
   public ArrayList<PersonInfo> Readcsv(String Filename) throws Throwable {
	   String path="C:\\Users\\PC\\eclipse-workspace\\addressbook\\src\\"+Filename;
	   BufferedReader BR=new BufferedReader(new FileReader(path));
	   ArrayList<PersonInfo> person=new ArrayList<PersonInfo>();
	   String line=null;
	   int i=0;
	   while ((line=BR.readLine())!=null) {
		   i=i+1;
		   if (i!=1) {
		 String[] value=line.split(",");
		 person.add(new PersonInfo(value[0].substring(1,value[0].length()-1),value[1].substring(1,value[1].length()-1),value[2].substring(1,value[2].length()-1),value[3].substring(1,value[3].length()-1),value[4].substring(1,value[4].length()-1),Integer.parseInt(value[5].substring(1, value[5].length()-1)),(value[6].substring(1, value[6].length()-1))));		 
		     } 
		   }
	   BR.close();
	   return person;
	  
	 
	  
   }
   public void showfiles() {
	   File folder=new File("C:\\Users\\PC\\eclipse-workspace\\addressbook\\src");
	   File file[]=folder.listFiles();
	   System.out.println("list of csv files");
	   for(File name:Objects.requireNonNull(file)) {
		   String filename=name.getName();
		   if(filename.contains(".csv")) {
			   System.out.println(filename);
			   
		   }
	   }
   }
   

}
