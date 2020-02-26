<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Student Information</h2>
      <form:form method = "POST" action = "/addStudent">
         <table>
         <tr>
         <th>Name</th>
         <th>Age</th>
         <th>Id</th>
         </tr>            
             <tr>
               <td>
              <%--  <c:forEach items="${myStu.name}" var="nameVar" varStatus="status">
               <input type="text" name="name" value="${nameVar}">
               </c:forEach> --%>
               <input type="text" name="stuList[0].name" value="">
               </td>
           
               
               <td><input type="text" name="stuList[0].age" value=""></td>
           
               
               <td><input type="text" name="stuList[0].id" value=""></td>
            </tr>
           <tr>
               <td>
              <%--  <c:forEach items="${myStu.name}" var="nameVar" varStatus="status">
               <input type="text" name="name" value="${nameVar}">
               </c:forEach> --%>
               <input type="text" name="stuList[1].name" value="">
               </td>
           
               
               <td><input type="text" name="stuList[1].age" value=""></td>
           
               
               <td><input type="text" name="stuList[1].id" value=""></td>
            </tr>
             
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
   
</html>