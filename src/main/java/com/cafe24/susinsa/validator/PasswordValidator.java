package com.cafe24.susinsa.validator;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.cafe24.susinsa.validator.constraints.ValidPassword;

public class PasswordValidator implements ConstraintValidator<ValidPassword, String> {
	
	private Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"); 
	/*
	        
			(?=.*[0-9])       # 최소 한번이상의 숫자
			(?=.*[a-z])       # 최소 한번 이상의 소문자
			(?=.*[A-Z])       # 최소 한번 이상의 대문자
			(?=.*[@#$%^&+=])  # @,#,$,%,^,&,+,= 을 최소한 한번 사용
			(?=\S+$)          # 스페이스바, 탭 불가
			.{6,20}           # 6~20의 길이

	 */
	@Override
	public void initialize(ValidPassword constraintAnnotation) {
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value == null || value.length() == 0 || "".contentEquals(value)) {
			return false;
		}

		return pattern.matcher( value ).matches();
	}
}