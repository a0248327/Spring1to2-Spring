/*
 * Created on 2006-2-24
 * TODO
 * author:gf
 */
package com.gc.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class LogListener implements ApplicationListener {

	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof LogEvent) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			format.setLenient(false);
			String currentDate = format.format(new Date());
			System.out.println("���ʱ�䣺" + currentDate + " ������ݣ�" + event.toString());
		}
	}
}
