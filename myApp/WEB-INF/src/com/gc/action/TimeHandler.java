/*
 * Created on 2006-3-3
 * TODO
 * author:gf
 */
package com.gc.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class TimeHandler implements MethodInterceptor {
	private Logger logger = Logger.getLogger(this.getClass().getName());

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		long procTime = System.currentTimeMillis();
		logger.log(Level.INFO, methodInvocation.getArguments()[0] + " ��ʼִ�� " + methodInvocation.getMethod() + " ����");
		try {
			Object result = methodInvocation.proceed();
			return result;
		} finally {
			procTime = System.currentTimeMillis() - procTime;
			logger.log(Level.INFO, methodInvocation.getArguments()[0] + " ִ�� " + methodInvocation.getMethod() + " ��������");
			logger.log(Level.INFO, "ִ�� " + methodInvocation.getMethod().getName() + " ���������� " + procTime + "����");
		}
	}
}