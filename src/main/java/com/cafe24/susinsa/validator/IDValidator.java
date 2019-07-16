package com.cafe24.susinsa.validator;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.cafe24.susinsa.validator.constraints.ValidID;

public class IDValidator implements ConstraintValidator<ValidID, String> {
	private Pattern pattern = Pattern.compile("\"^[\\\\w-_\\\\.+]*[\\\\w-_\\\\.]\\\\@([\\\\w]+\\\\.)+[\\\\w]+[\\\\w]$\""); 

	@Override
	public void initialize(ValidID constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value == null || value.length() == 0 || "".contentEquals(value)) {
			return false;
		}

		return pattern.matcher( value ).matches();
	}
}