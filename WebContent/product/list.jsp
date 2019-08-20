<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
 
<%@ taglib prefix="s" uri="/struts-tags" %>
 
<%@page isELIgnored="false"%>

<table>
	<tr>
	    <td>序号</td>
	    <td>名称</td>
	    <td>价格：</td>
	</tr>
	                 
	<s:iterator value="products" var="p">
	    <tr>
	        <td>${p.id}</td>
	        <td>${p.name}</td>
	        <td>${p.price }</td>
	    </tr>
	</s:iterator>	
</table>