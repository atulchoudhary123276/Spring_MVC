<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
      <link rel="icon" type="image/x-icon" href="/images/favicon.ico">

</head>
<body>
    <h2>Login</h2>
    <form action="userDetails" method="post">
       Username:<br>
        <input type="text" name="username"><br>
       Password:<br>
        <input type="password" name="password"><br><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>
