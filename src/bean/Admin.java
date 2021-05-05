package bean;

public class Admin {
	private int aid;
	private String email;
	private String password;
	
	public Admin(){}

	public Admin(int aid, String email, String password) {
		super();
		this.aid = aid;
		this.email = email;
		this.password = password;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
