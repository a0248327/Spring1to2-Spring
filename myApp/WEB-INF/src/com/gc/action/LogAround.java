/*
 * Created on 2006-3-1
 * TODO
 * author:gf
 */
package com.gc.action;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LogAround implements MethodInterceptor {
	private Logger logger = Logger.getLogger(this.getClass().getName());

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		logger.log(Level.INFO, methodInvocation.getArguments()[0] + " ��ʼ������....");
		try {
			Object result = methodInvocation.proceed();
			return result;
		} finally {
			logger.log(Level.INFO, methodInvocation.getArguments()[0] + " �����ݽ���....");
		}
	}
}
