<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Main</title>
    <link rel="stylesheet" href="login.css">
</head>
<body>

<div class="WelcomeSection">
    <div><h2 id="titleColor">Welcome to login!</h2></div>
</div>


<!----------- Form start ------------>

<div class="FormSection">
    <form class="form" action="<%= request.getContextPath() %>/LoginServlet" method="post">
        <input class="formInputEmail" type="text" name="email" placeholder="Email address"><br>
        <input class="formInputEmail" type="password" id="myInput" name="password" placeholder="Password">

        <br>
        <div>
            <input type="submit" id="button" value="Log In">
        </div>
        <br>
        <div class="linktext">
            <a href="resetPasswordForm.jsp" class="forgotPassword"> Forgotten password? </a>

            <div class="loginSignUpSeparator">
                <span class="textInSeparator">or</span>
            </div>
            <button onclick="location.href='registration.jsp'" type="button" id="button2">
                Sign up
            </button>
        </div>
    </form>
</div>

<!----------- Form end ------------>


</body>
</html>