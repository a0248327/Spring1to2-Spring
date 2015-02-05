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
		logger.log(Level.INFO, methodInvocation.getArguments()[0] + " 开始执行 "
				+ methodInvocation.getMethod() + " 方法");
		try {
			Object result = methodInvocation.proceed();
			return result;
		} finally {
			procTime = System.currentTimeMillis() - procTime;
			logger.log(Level.INFO, methodInvocation.getArguments()[0] + " 执行 "
					+ methodInvocation.getMethod() + " 方法结束");
			logger.log(Level.INFO, "执行 "
					+ methodInvocation.getMethod().getName() + " 方法共用了 "
					+ procTime + "毫秒");
		}
	}
}