/*
 * Created on 2006-3-3
 * TODO
 * author:gf
 */
package com.gc.action;

import com.gc.impl.LogicInterface;

public class Logic1 implements LogicInterface {
	public void doInsert(String name) {
		System.out.println("执行具体负责新增的业务逻辑。。。");
		for (int i = 0; i < 100000000; i++) {

		}
	}

	public void doUpdate(String name) {
		System.out.println("执行具体负责修改的业务逻辑。。。");
		for (int i = 0; i < 200000000; i++) {

		}
	}

	public void doDelete(String name) {
		System.out.println("执行具体负责删除的业务逻辑。。。");
		for (int i = 0; i < 300000000; i++) {
			i = i / 0;
		}
	}
}
