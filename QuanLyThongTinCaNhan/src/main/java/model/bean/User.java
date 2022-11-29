package model.bean;

public class User {
	private String UserName;
	private String Password;

	public User(String userName, String password) {
		this.Password = password;
		this.UserName = userName;
	}

	public String getName() {
		return this.UserName;
	}

	public void setName(String userName) {
		this.UserName = userName;
	}

	public String getPassword() {
		return this.Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}
}
