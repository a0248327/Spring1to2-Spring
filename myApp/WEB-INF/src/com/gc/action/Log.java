/*
 * Created on 2006-2-24
 * TODO
 * author:gf
 */
package com.gc.action;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Log implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

	public int log(String log) {
		LogEvent event = new LogEvent(log);
		this.applicationContext.publishEvent(event);
		return 0;
	}
}
