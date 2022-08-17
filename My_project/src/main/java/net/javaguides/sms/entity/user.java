package net.javaguides.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class user {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userID;
	@Column(name= "userName")
	private String userName;
	@Column(name= "userEmail")
	private String email;
	@Column(name= "password")
	private String passWord;
	
	
	
	public user(String userName, String email, String passWord) {
		super();
		this.userName = userName;
		this.email = email;
		this.passWord = passWord;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	

}
