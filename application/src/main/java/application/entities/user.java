package application.entities;

public class user {
	private String password ;
	private String username;
	private String Email;
	public user() {
		username="";
		password="";
		Email="";
	}
	public user(String password, String username,String Email) {
		super();
		this.password = password;
		this.username = username;
		this.Email = Email;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
