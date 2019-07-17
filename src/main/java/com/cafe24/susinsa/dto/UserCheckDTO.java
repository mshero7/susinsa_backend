package com.cafe24.susinsa.dto;

public class UserCheckDTO {
	public String name;
	public String phone;
	public String enc_key;
	
	public UserCheckDTO() {
		
	}

	public UserCheckDTO(String name, String phone, String enc_key) {
		super();
		this.name = name;
		this.phone = phone;
		this.enc_key = enc_key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEnc_key() {
		return enc_key;
	}

	public void setEnc_key(String enc_key) {
		this.enc_key = enc_key;
	}
	
}
