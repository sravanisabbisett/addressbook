package addressbook;



public class PersonInfo  {
	public String firstname;
	public String lastname;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String phonenumber;
	
	public PersonInfo(String firstname,String lastname,String address,String city,String state,String zip,String phonenumber) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phonenumber=phonenumber;
	}
	public String getfname()
	{
		return firstname;
	}
	public String getlname() {
		return lastname;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getstate() {
		return state;
	}
	public String getzip() {
		return zip;
	}
	public String getphonenumber() {
		return phonenumber;
	}
	public void setFirstname(String firstname) {
		this.firstname=firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
	public String toString() {
		return "firstname:"+firstname+",lastname:"+lastname+",address:"+address+",city:"+city+",state:"+state+",zip:"+zip+",phonenumber:"+phonenumber;
	}
	
}
