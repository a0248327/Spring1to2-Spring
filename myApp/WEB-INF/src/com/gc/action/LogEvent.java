/*
 * Created on 2006-2-24
 * TODO
 * author:gf
 */
package com.gc.action;

import org.springframework.context.ApplicationEvent;

public class LogEvent extends ApplicationEvent {
	public LogEvent(Object msg) {
		super(msg);
	}
}
