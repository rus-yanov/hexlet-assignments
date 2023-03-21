<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- BEGIN -->
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Company</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
    </head>
    <body>
        <tr>
        <td>${user.get("id")}</td>
        <td>${user.get("firstName")}</td>
        <td>${user.get("lastName")}</td>
        <td>${user.get("email")}</td>
        </tr>
        <a href='/users/delete?id=${user.get("id")}'>Delete user</a>
    </body>
</html>
<!-- END -->
