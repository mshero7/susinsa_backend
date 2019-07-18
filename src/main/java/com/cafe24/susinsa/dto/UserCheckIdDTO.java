package com.cafe24.susinsa.dto;

import org.hibernate.validator.constraints.NotEmpty;

import com.cafe24.susinsa.validator.constraints.ValidID;

public class UserCheckIdDTO {
	@NotEmpty(message = "아이디는 필수 입니다.")
	@ValidID
	public String id;
	public String enc_key;
	
	public UserCheckIdDTO() {
		
	}
	
	public UserCheckIdDTO(String id, String enc_key) {
		super();
		this.id = id;
		this.enc_key = enc_key;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEnc_key() {
		return enc_key;
	}

	public void setEnc_key(String enc_key) {
		this.enc_key = enc_key;
	}

}
