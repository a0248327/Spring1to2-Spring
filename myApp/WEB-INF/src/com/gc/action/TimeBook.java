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
		// ������ݵ���س���
		System.out.println("������ݵ���س�������ִ�С�����");
		// int m = 1/0;
	}

	public void doCheck(String name) {
		// ���ʵ���س���
		System.out.println("������ʵ���س�������ִ�С�����");
	}
}
