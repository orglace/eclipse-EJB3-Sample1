<%-- 
    Document   : list
    Created on : Feb 19, 2016, 11:54:37 AM
    Author     : luis
--%>

<%@page import="java.util.List" %>
<%@page import="com.example.ejb.entity.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Accounts</title>
    </head>
    <body>
        <a href="index.html">Back to Principal Menu</a>
        <br>
        <br>
        
        <table border="1" cellpadding="5" cellspacing="5">
            <tr bgcolor="grey">
                <td>ID #</td>
                <td>First Name</td>
                <td>Last Name</td>
            </tr>            
            
            <%
                List<Customer> customers = (List<Customer>)request.getAttribute("customers");
                
                if(null != customers)
                    
                    for (Customer customer : customers){
                        %>
                        <tr>
                            <td><%= customer.getId() %></td>                        
                            <td><%= customer.getFirstName() %></td>                        
                            <td><%= customer.getLastName() %></td>                        
                        </tr>
                        <%
                    }
            %>
            
        </table>
    </body>
</html>
