<%@taglib prefix="spring" uri="/spring"%>
<%@page contentType="text/html;charset=GBK"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<html> 
<head><title>Spring MVC实例</title></head> 
<%
String str = (String)request.getAttribute("helloWorld");
%>
<body> 
    <form name="loginform" action="/myApp/hellWorld.do" method="post"> 
        您输入的欢迎语是"${helloWorld}"<br> 
        <spring:bind path="command.msg"> 
       输入验证<input type="text" name="${status.expression}" value="${status.value}"/><br>
	          <font color="red"><b>${status.errorMessage}</b></font><br>
        </spring:bind>
        <input type="submit" value="提交"/> 
    </form> 
    
</body> 
</html>