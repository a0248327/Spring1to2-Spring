/*
 * Created on 2006-1-12
 * TODO
 * author:gf
 */
package com.gc.action;

import com.gc.impl.Hello;

public class EnHello implements Hello {
	public String msg = null;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return this.msg;
	}

	public String doSalutation() {
		return "Hello " + this.msg;
	}
}
