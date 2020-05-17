<%-- 
    Document   : verify
    Created on : May 17, 2020, 5:53:26 PM
    Author     : christina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! 
public boolean userNameIsValid(String user_name) {
    if (user_name == null || user_name.trim().length() == 0){
        return false;
    } else {
        return true;
    }
}
public boolean passwordsAreValid(String password1, String password2) {
    if (password1 != null && password2 != null && password1.trim().length() != 0 && password1.trim().equals(password2.trim())) {
        return true;
    } else {
        return false;
    }
}
public boolean phoneNumberIsValid (String phone) {
    if (phone != null && phone.trim().matches("^[0-9]{8}$")) {
        return true;
    } else {
        return false;
    }
}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
table, th, td {
  border: 1px solid black;
}
</style>
    </head>
    <body>
        <table>
            <tr>
                <td><h1>User name: </h1></td>
        <td>
        <% if (userNameIsValid(request.getParameter("user_name"))){
                            out.println("<h1>valide</h1>");
                        } else {
            out.println("<h1 style=\"color:red\">invalide, user name doit etre non vide!</h1>");
        }%>
        </td>
        </tr>
        
        
        <tr>
                <td><h1>Password </h1></td>
        <td>
        <% if (passwordsAreValid(request.getParameter("create_password"), request.getParameter("reenter_password"))){
                            out.println("<h1>valide</h1>");
                        } else {
            out.println("<h1 style=\"color:red\">invalide, les mots de passe doivent etre identiques et non vides!</h1>");
        }%>
        </td>
        </tr>
        
        <tr>
                <td><h1>User name: </h1></td>
        <td>
        <% if (phoneNumberIsValid(request.getParameter("phone"))){
                            out.println("<h1>valide</h1>");
                        } else {
            out.println("<h1 style=\"color:red\">invalide, le numero de telephone doit etre forme de 8 chiffres!</h1>");
        }%>
        </td>
        </tr>
        
        </table>
        
    </body>
</html>
