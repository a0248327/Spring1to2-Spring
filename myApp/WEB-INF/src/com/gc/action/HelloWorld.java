/*
 * Created on 2006-1-11
 *
 * author:gf
 */
package com.gc.action;

import java.util.Date;

import org.springframework.beans.factory.InitializingBean;

public class HelloWorld {
	private String msg = null;

	// private Date date = null;
	//
	// public void init () {
	// this.msg = "HelloWorld";
	// this.date = new Date();
	//
	// }
	//
	// public void cleanup () {
	// this.msg = "";
	// this.date = null;
	// System.out.println("ÄúÏú»ÙÁËmsg " + this.msg + "ºÍdate " + this.date);
	// }
	//
	// public void afterPropertiesSet () {
	// this.msg = "HelloWorld";
	// this.date = new Date();
	// }
	// public HelloWorld () {
	// }
	//
	//
	// public HelloWorld (String msg) {
	// this.msg = msg;
	// }

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return this.msg;
	}
	//
	// public void setDate(Date date) {
	// this.date = date;
	// }
	//
	// public Date getDate() {
	// return this.date;
	// }
}
