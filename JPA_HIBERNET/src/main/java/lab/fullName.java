package lab;

import javax.persistence.Embeddable;

@Embeddable
public class fullName {
	private String fname;
	private String lname;
	public String getFname() {
		return fname;
	}
	@Override
	public String toString() {
		return "fullName [fname=" + fname +  ", lname=" + lname + "]";
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

}
