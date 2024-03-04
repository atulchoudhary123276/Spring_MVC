<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Details</title>
    <style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
    }

    h2 {
        color: #333;
    }

    p {
        color: #555;
    }

    h3 {
        color: green;
    }

    /* You can add more styles as needed */

    </style>
</head>
<body>
    <h2>Your Details :${username}</h2>
    <p>Username: ${username}</p>
    <p>Password: ${password}</p>
    <h3 style="color:green;">Yor are successfully Logged in!</h3>
</body>
</html>
