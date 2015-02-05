/*
 * Created on 2006-3-3
 * TODO
 * author:gf
 */
package com.gc.action;

import java.lang.reflect.Method;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

public class ExceptionHandler implements ThrowsAdvice {
	private Logger logger = Logger.getLogger(this.getClass().getName());

	public void afterThrowing(Method method, Object[] args, Object target, Throwable subclass) throws Throwable {
		logger.log(Level.INFO, args[0] + " ִ�� " + method.getName() + " ʱ���쳣�׳�...." + subclass);
	}
}
