package com.nongyou.commons.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.nongyou.commons.vo.User;

public class UserValidator implements ConstraintValidator<UserConstraint, User> {
	/**
	 * 可以注入spring容器的组件
	 * **/
	@Override
	public void initialize(UserConstraint constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(User user, ConstraintValidatorContext context) {
		if(user.getAge()>100) {
			context.buildConstraintViolationWithTemplate("user age can not exceed 100").addPropertyNode("age").addConstraintViolation();
			return false;
		}
		if(user.getAge()<1) {
			context.buildConstraintViolationWithTemplate("age can not less than 1").addPropertyNode("age").addConstraintViolation();
			return false;
		}
		return true;
	}

}
