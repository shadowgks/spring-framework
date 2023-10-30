<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
  <h1>Hello Login</h1>
    <p>${ops}</p>
      <form action="login" method="post">
          <label>Username</label>
          <input type="text" name="username"><br>
          <label>Password</label>
          <input type="text" name="password"><br>
          <button type="submit">Send</button>
      </form>
</body>
</html>
