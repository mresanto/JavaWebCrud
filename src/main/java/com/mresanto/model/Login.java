package com.mresanto.model;

public class Login {
	
	public int user_id;
	public String username;
	public String pswd;
	public String fullname;
	public String email;
	
	public Login() {
		super();
	}
	
	public Login(String username, String pswd, String fullname, String email) {
		super();
		this.username = username;
		this.pswd = pswd;
		this.fullname = fullname;
		this.email = email;
	}

	@Override
	public String toString() {
		return "userModel [user_id=" + user_id + ", username=" + username + ", pswd=" + pswd + ", fullname=" + fullname
				+ ", email=" + email + "]";
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
