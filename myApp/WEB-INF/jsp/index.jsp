<%@taglib prefix="spring" uri="/spring"%>
<%@page contentType="text/html;charset=GBK"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<html> 
<head><title>Spring MVCʵ��</title></head> 
<%
String str = (String)request.getAttribute("helloWorld");
%>
<body> 
    <form name="loginform" action="/myApp/hellWorld.do" method="post"> 
        ������Ļ�ӭ����"${helloWorld}"<br> 
        <spring:bind path="command.msg"> 
       ������֤<input type="text" name="${status.expression}" value="${status.value}"/><br>
	          <font color="red"><b>${status.errorMessage}</b></font><br>
        </spring:bind>
        <input type="submit" value="�ύ"/> 
    </form> 
    
</body> 
</html>