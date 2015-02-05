/*
 * Created on 2006-2-28
 * TODO
 * author:gf
 */
package com.gc.action;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.gc.impl.TimeBookInterface;

public class TimeBookProxy {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private TimeBookInterface timeBookInterface;

	public TimeBookProxy(TimeBookInterface timeBookInterface) {
		this.timeBookInterface = timeBookInterface;
	}

	public void doAuditing(String name) {
		logger.log(Level.INFO, name + " 开始审核数据....");
		timeBookInterface.doAuditing(name);
		// 审核数据的相关程序。
		logger.log(Level.INFO, name + " 审核数据结束....");
	}
}
