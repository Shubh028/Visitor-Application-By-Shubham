package bean;

public class Visitor {
	private int vid;
	private String vname;
	private String email;
	private String address;
	private int contact;
	private String qualification;
	private String purpose;
	private String vdate;
	
	public Visitor(){}

	public Visitor(int vid, String vname, String email, String address, int contact, String qualification,
			String purpose, String vdate) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.email = email;
		this.address = address;
		this.contact = contact;
		this.qualification = qualification;
		this.purpose = purpose;
		this.vdate = vdate;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getVdate() {
		return vdate;
	}

	public void setVdate(String vdate) {
		this.vdate = vdate;
	}



}
