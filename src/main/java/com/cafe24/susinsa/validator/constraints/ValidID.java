package com.cafe24.susinsa.validator.constraints;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.cafe24.susinsa.validator.IDValidator;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy=IDValidator.class)
public @interface ValidID {
	String message() default "이메일 양식에 어긋납니다.";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {}; 
}