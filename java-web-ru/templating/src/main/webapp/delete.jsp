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
        <p>Do you want to delete this user?</p>
        <p>${user.get("id")} ${user.get("firstName")} ${user.get("lastName")}</p>
        <form action="users/delete" method="post">
            <input name="id" value=${user.get("id")} type="hidden">
            <button type="submit" class="btn btn-danger">Delete</button>
        </form>
    </body>
</html>
<!-- END -->
