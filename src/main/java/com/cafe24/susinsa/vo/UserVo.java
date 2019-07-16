package com.cafe24.susinsa.vo;

import java.sql.Date;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author user
 *
 */
public class UserVo {
	private Long no;
	@NotEmpty(message = "아이디는 필수 입니다.")
	@Email(message = "이메일 형식으로 입력해주세요.")
	@Pattern(regexp = "/[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/", message="영어로만 작성해주세요.")
	private String id;
	
	@NotEmpty(message = "패스워드는 필수입니다.")
	@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})",
				message = "비밀 번호는 6~20자리로 숫자와 특수 문자가 포함된 영문 대소문자로 입력해 주세요")
	private String password;
	
	@NotEmpty(message = "이름은 필수입니다.")
	private String name;
	private String gender;
	@NotEmpty(message = "주민번호는 필수입니다.")
	private String personalNumber;
	
	public String getPersonalNumber() {
		return personalNumber;
	}

	public UserVo(Long no, String id, String password, String name, String gender, String personalNumber, String phone,
			String grade, int mileage, Date joinDate) {
		super();
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.personalNumber = personalNumber;
		this.phone = phone;
		this.grade = grade;
		this.mileage = mileage;
		this.joinDate = joinDate;
	}

	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}

	private String phone;
	private String grade;
	private int mileage;
	private Date joinDate;
	
	public UserVo() {
	}
	
	public  UserVo(String id, String password) {
		this.id = id;
		this.password = password;
	}

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


	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "UserVo [no=" + no + ", id=" + id + ", password=" + password + ", name=" + name + ", gender=" + gender
				+ ", personalNumber=" + personalNumber + ", phone=" + phone + ", grade=" + grade + ", mileage="
				+ mileage + ", joinDate=" + joinDate + "]";
	}
	
	
}
