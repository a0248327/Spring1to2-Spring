package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
		implements org.apache.jasper.runtime.JspSourceDependent {

	private static java.util.Vector _jspx_dependants;

	static {
		_jspx_dependants = new java.util.Vector(1);
		_jspx_dependants.add("/WEB-INF/spring.tld");
	}

	private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_bind_path;

	public java.util.List getDependants() {
		return _jspx_dependants;
	}

	public void _jspInit() {
		_jspx_tagPool_spring_bind_path = org.apache.jasper.runtime.TagHandlerPool
				.getTagHandlerPool(getServletConfig());
	}

	public void _jspDestroy() {
		_jspx_tagPool_spring_bind_path.release();
	}

	public void _jspService(HttpServletRequest request,
			HttpServletResponse response) throws java.io.IOException,
			ServletException {

		JspFactory _jspxFactory = null;
		PageContext pageContext = null;
		HttpSession session = null;
		ServletContext application = null;
		ServletConfig config = null;
		JspWriter out = null;
		Object page = this;
		JspWriter _jspx_out = null;
		PageContext _jspx_page_context = null;

		try {
			_jspxFactory = JspFactory.getDefaultFactory();
			response.setContentType("text/html;charset=GBK");
			pageContext = _jspxFactory.getPageContext(this, request, response,
					null, true, 8192, true);
			_jspx_page_context = pageContext;
			application = pageContext.getServletContext();
			config = pageContext.getServletConfig();
			session = pageContext.getSession();
			out = pageContext.getOut();
			_jspx_out = out;

			out.write("\r\n");
			out.write("\r\n");
			out.write("\r\n");
			out.write("\r\n");
			out.write("<html> \r\n");
			out.write("<head><title>Spring MVC实例</title></head> \r\n");

			String str = (String) request.getAttribute("helloWorld");

			out.write("\r\n");
			out.write("<body> \r\n");
			out.write("    <form name=\"loginform\" action=\"/myApp/hellWorld.do\" method=\"post\"> \r\n");
			out.write("        您输入的欢迎语是\"");
			out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl
					.proprietaryEvaluate("${helloWorld}",
							java.lang.String.class,
							(PageContext) _jspx_page_context, null, false));
			out.write("\"<br> \r\n");
			out.write("        ");
			// spring:bind
			org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path
					.get(org.springframework.web.servlet.tags.BindTag.class);
			_jspx_th_spring_bind_0.setPageContext(_jspx_page_context);
			_jspx_th_spring_bind_0.setParent(null);
			_jspx_th_spring_bind_0.setPath("command.msg");
			int[] _jspx_push_body_count_spring_bind_0 = new int[] { 0 };
			try {
				int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0
						.doStartTag();
				if (_jspx_eval_spring_bind_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
					org.springframework.web.servlet.support.BindStatus status = null;
					status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context
							.findAttribute("status");
					do {
						out.write(" \r\n");
						out.write("       输入验证<input type=\"text\" name=\"");
						out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl
								.proprietaryEvaluate("${status.expression}",
										java.lang.String.class,
										(PageContext) _jspx_page_context, null,
										false));
						out.write("\" value=\"");
						out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl
								.proprietaryEvaluate("${status.value}",
										java.lang.String.class,
										(PageContext) _jspx_page_context, null,
										false));
						out.write("\"/><br>\r\n");
						out.write("\t          <font color=\"red\"><b>");
						out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl
								.proprietaryEvaluate("${status.errorMessage}",
										java.lang.String.class,
										(PageContext) _jspx_page_context, null,
										false));
						out.write("</b></font><br>\r\n");
						out.write("        ");
						int evalDoAfterBody = _jspx_th_spring_bind_0
								.doAfterBody();
						status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context
								.findAttribute("status");
						if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
							break;
					} while (true);
				}
				if (_jspx_th_spring_bind_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
					return;
			} catch (Throwable _jspx_exception) {
				while (_jspx_push_body_count_spring_bind_0[0]-- > 0)
					out = _jspx_page_context.popBody();
				_jspx_th_spring_bind_0.doCatch(_jspx_exception);
			} finally {
				_jspx_th_spring_bind_0.doFinally();
				_jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_0);
			}
			out.write("\r\n");
			out.write("        <input type=\"submit\" value=\"提交\"/> \r\n");
			out.write("    </form> \r\n");
			out.write("    \r\n");
			out.write("</body> \r\n");
			out.write("</html>");
		} catch (Throwable t) {
			if (!(t instanceof SkipPageException)) {
				out = _jspx_out;
				if (out != null && out.getBufferSize() != 0)
					out.clearBuffer();
				if (_jspx_page_context != null)
					_jspx_page_context.handlePageException(t);
			}
		} finally {
			if (_jspxFactory != null)
				_jspxFactory.releasePageContext(_jspx_page_context);
		}
	}
}
