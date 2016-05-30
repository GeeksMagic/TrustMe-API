package com.trustme.api.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="users")
public class Users {
	
	
	@GeneratedValue
	@JsonProperty
	@Column(name="id")
	private int id;
	
	@Id
	@JsonProperty
	@Column(name="user_id")
	private String user_id;
	
	@JsonProperty
	@Column(name="first_name")
	private String first_name;
	
	@JsonProperty
	@Column(name="last_name")
	private String last_name;
	
	@JsonProperty
	@Column(name="password")
	private String password;
	
	@JsonProperty	
	@Column(name="address")
	private String address;
	
	@JsonProperty	
	@Column(name="phone")
	private int phone;
	
	@JsonProperty	
	@Column(name="type")
	private int type;
	
	@JsonProperty	
	@Column(name="profile_pic")
	private String profile_pic;
	
	@JsonProperty	
	@Column(name="gender")
	private String gender;
	
	@JsonProperty	
	@Column(name="dob")
	private String dob;
	
	@JsonProperty	
	@Column(name="pass_code")
	private String pass_code;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}
	
	public Users(int id, String user_id, String first_name, String last_name, String password, String address,
			int phone, int type, String profile_pic, String gender, String dob, String pass_code) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
		this.address = address;
		this.phone = phone;
		this.type = type;
		this.profile_pic = profile_pic;
		this.gender = gender;
		this.dob = dob;
		this.pass_code = pass_code;
	}

	public Users(int id){
		this.id=id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserID() {
		return user_id;
	}

	public void setUserID(String user_id) {
		this.user_id = user_id;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String last_name) {
		this.last_name = last_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getProfilePic() {
		return profile_pic;
	}

	public void setProfilePic(String profile_pic) {
		this.profile_pic = profile_pic;
	}

	public String isGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPassCode() {
		return pass_code;
	}

	public void setPassCode(String pass_code) {
		this.pass_code = pass_code;
	}

	
}
