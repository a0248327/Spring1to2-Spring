/*
 * Created on 2006-3-1
 * TODO
 * author:gf
 */
package com.gc.action;

import java.lang.reflect.Method;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class LogAfter implements AfterReturningAdvice {
	private Logger logger = Logger.getLogger(this.getClass().getName());

	public void afterReturning(Object object, Method method, Object[] args, Object target) throws Throwable {
		logger.log(Level.INFO, args[0] + " ���������....");
	}
}
