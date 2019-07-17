package com.cafe24.susinsa.vo;

import java.sql.Date;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.cafe24.susinsa.validator.constraints.ValidGender;
import com.cafe24.susinsa.validator.constraints.ValidID;
import com.cafe24.susinsa.validator.constraints.ValidPassword;

/**
 * @author user
 *
 */
public class UserVo {
	private Long no;
	@NotEmpty(message = "아이디는 필수 입니다.")
	@ValidID
	private String id;

	@NotEmpty(message = "패스워드는 필수입니다.")
	@ValidPassword
	private String password;

	@NotEmpty(message = "이름은 필수입니다.")
	private String name;

	@ValidGender
	private String gender;

	private String phone;
	private Date joinDate;
	private String secret_key;
	
	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public UserVo(Long no, String id, String password, String name, String gender, String phone, Date joinDate,
			String secret_key) {
		super();
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.joinDate = joinDate;
		this.secret_key = secret_key;
	}

	public String getSecret_key() {
		return secret_key;
	}

	public void setSecret_key(String secret_key) {
		this.secret_key = secret_key;
	}

	@Override
	public String toString() {
		return "UserVo [no=" + no + ", id=" + id + ", password=" + password + ", name=" + name + ", gender=" + gender
				+ ", phone=" + phone + ", joinDate=" + joinDate + ", secret_key=" + secret_key + "]";
	}

}
