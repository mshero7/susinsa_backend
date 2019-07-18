package com.cafe24.susinsa.validator.constraints;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.cafe24.susinsa.validator.PasswordValidator;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy=PasswordValidator.class)
public @interface ValidPassword {
	// 기회되면 각 케이스별로 만족됬는지 나타내어보기
	String message() default "대,소문자,숫자,특수문자가 포함된 6자~20자 비밀번호를 지정해주세요";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {}; 
}