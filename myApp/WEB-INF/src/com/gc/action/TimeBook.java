/*
 * Created on 2006-2-27
 * TODO
 * author:gf
 */
package com.gc.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.gc.impl.TimeBookInterface;

public class TimeBook implements TimeBookInterface {
	public void doAuditing(String name) {
		// 审核数据的相关程序。
		System.out.println("审核数据的相关程序正在执行。。。");
		// int m = 1/0;
	}

	public void doCheck(String name) {
		// 关帐的相关程序。
		System.out.println("财务关帐的相关程序正在执行。。。");
	}
}
