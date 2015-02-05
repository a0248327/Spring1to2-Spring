/*
 * Created on 2006-3-3
 * TODO
 * author:gf
 */
package com.gc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gc.action.Logic2;
import com.gc.impl.LogicInterface;

public class TestAop {
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		ApplicationContext actx = new FileSystemXmlApplicationContext(
				"exception_config.xml");
		LogicInterface logic = (LogicInterface) actx.getBean("logic1");
		// Logic2 logic2 = (Logic2)actx.getBean("logic2");
		try {
			logic.doInsert("张三");
			logic.doUpdate("李四");
			logic.doDelete("王五");
		} catch (Exception ex) {

		}
	}
}
