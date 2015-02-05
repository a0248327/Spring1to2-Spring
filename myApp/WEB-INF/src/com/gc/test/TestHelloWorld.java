/*
 * Created on 2006-1-12
 * TODO
 * author:gf
 */
package com.gc.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gc.action.HelloWorld;
import com.gc.action.Log;
import com.gc.action.LogProxy;
import com.gc.action.TimeBook;
import com.gc.action.TimeBookProxy;
import com.gc.impl.FinanceInterface;
import com.gc.impl.Hello;
import com.gc.impl.TimeBookInterface;

public class TestHelloWorld {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ApplicationContext actx = new FileSystemXmlApplicationContext("config.xml");
		TimeBookInterface timeBookProxy = (TimeBookInterface) actx.getBean("timeBook");
		timeBookProxy.doAuditing("����");

		// FinanceInterface financeProxy =
		// (FinanceInterface)actx.getBean("logProxy1");
		// financeProxy.doCheck("����");
		// Object[] objs = new Object[] {"HelloWorld",
		// Calendar.getInstance().getTime()};
		// String msg = actx.getMessage("HelloWorld", objs, Locale.US);
		// System.out.println(msg);

		// Log log = (Log)actx.getBean("log");
		// log.log("gf");

		// TimeBookProxy timeBookProxy = new TimeBookProxy(new
		// TimeBook());
		// timeBookProxy .doAuditing("����");

		// LogProxy logProxy = new LogProxy();
		// TimeBookInterface timeBookProxy =
		// (TimeBookInterface)logProxy.bind(new TimeBook());
		// timeBookProxy.doAuditing("����");

		// HelloWorld helloWorld = (HelloWorld)
		// actx.getBean("HelloWorld");
		//
		// //System.out.println(helloWorld.getDate() + " " +
		// helloWorld.getMsg());
		//
		// Object obj =
		// Class.forName("com.gc.action.HelloWorld").newInstance();
		// BeanWrapper bw = new BeanWrapperImpl(obj);
		// bw.setPropertyValue("msg", "gf");
		// bw.setPropertyValue("date", new Date());
		// System.out.println(bw.getPropertyValue("date") + " " +
		// bw.getPropertyValue("msg"));
		// HelloWorld helloWorld = new HelloWorld();
		// //����set������HelloWordע�������
		// helloWorld.setMsg("HelloWorld");
		// ����get������ȡ�ղ�ע���HelloWorld
		// System.out.println(helloWorld.getMsg());

		// ApplicationContext actx=new
		// FileSystemXmlApplicationContext("config.xml");
		// Hello hello = (Hello) actx.getBean("HelloWorld");
		// System.out.println(hello.doSalutation());
	}
}
