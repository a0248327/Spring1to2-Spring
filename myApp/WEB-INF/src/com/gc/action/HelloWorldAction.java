/*
 * Created on 2006-3-23
 * TODO
 * author:gf
 */
package com.gc.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.RequestUtils;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.view.RedirectView;

public class HelloWorldAction extends SimpleFormController {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private String helloWorld;

	// private String viewPage;

	// public ModelAndView handleRequest(HttpServletRequest req,
	// HttpServletResponse res)
	// throws ServletException, IOException {
	public ModelAndView onSubmit(Object command, BindException errors)
			throws Exception {
		HelloWorld helloWorld = (HelloWorld) command;
		// //String user = RequestUtils.getRequiredStringParameter(req, "msg");
		// Map model = new HashMap();
		// //System.out.println(helloWorld.getMsg());
		// model.put("helloWorld", helloWorld.getMsg());
		// //model.put("user", user);
		// //logger.info("ffff");
		//
		// return new ModelAndView(getViewPage(), model);
		// }
		Map model = errors.getModel();
		model.put("helloWorld", helloWorld.getMsg());
		// if (helloWorld != null && helloWorld.getMsg().length() > 10 ) {
		// errors.rejectValue("msg", "", null, "欢迎语不能大于10个字符");
		// //return new ModelAndView(new RedirectView("input.jsp"), model);
		// return new ModelAndView(getViewPage(), model);
		// } else {
		//
		return new ModelAndView(getFormView(), model);
		// }
	}

	// public ModelAndView insert(HttpServletRequest req, HttpServletResponse
	// res, String className) throws ServletRequestBindingException {
	// String helloWorld = RequestUtils.getRequiredStringParameter(req, "msg");
	// Map model = new HashMap();
	// model.put("helloWorld", "insert:" + helloWorld);
	// return new ModelAndView(getViewPage(), model);
	// }
	//
	// public ModelAndView update(HttpServletRequest req, HttpServletResponse
	// res) throws ServletRequestBindingException {
	// String helloWorld = RequestUtils.getRequiredStringParameter(req, "msg");
	// Map model = new HashMap();
	// model.put("helloWorld", "update:" + helloWorld);
	// return new ModelAndView(getViewPage(), model);
	// }
	//
	// public ModelAndView delete(HttpServletRequest req, HttpServletResponse
	// res) throws ServletRequestBindingException {
	// String helloWorld = RequestUtils.getRequiredStringParameter(req, "msg");
	// Map model = new HashMap();
	// model.put("helloWorld", "delete:" + helloWorld);
	// return new ModelAndView(getViewPage(), model);
	// }

	// public void setViewPage(String viewPage) {
	// this.viewPage = viewPage;
	// }
	//
	// public String getViewPage() {
	// return viewPage;
	// }

	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}

	public String getHelloWorld() {
		return helloWorld;
	}
}
