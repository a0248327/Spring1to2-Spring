/*
 * Created on 2006-4-11
 * TODO
 * author:gf
 */
package com.gc.action;

import org.springframework.validation.Validator;
import org.springframework.validation.Errors;

public class HelloWorldValidator implements Validator {
	public boolean supports(Class clazz) {
		return clazz.equals(HelloWorld.class);
	}

	public void validate(Object obj, Errors errors) {
		HelloWorld helloWorld = (HelloWorld) obj;

		if (helloWorld.getMsg().length() > 10) {
			errors.rejectValue("msg", "", null, "欢迎语不能大于10个字符");
		}
	}

}
