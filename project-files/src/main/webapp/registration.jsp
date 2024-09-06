<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Main</title>
    <link rel="stylesheet" href="registration.css">
</head>
<body class="body">

<div class="WelcomeSection">
    <div>
        <%--        <img src="Capture.PNG" width="150" height="150" class="imageLogo">--%>
    </div>
</div>


<!----------- Form start ------------>
<div class="FormSection">
    <form class="form" action="<%= request.getContextPath() %>/RegistrationServlet" method="post">
        <div class="view-header">Create a new account</div>
        <div class="headerText">It's quick and easy.</div>
        <input class="formInputUsername" type="text" name="firstName" placeholder="First name">
        <input class="formInputUsername" type="text" name="lastName" placeholder="Surname"><br>
        <input class="formInputEmail" type="text" name="email" placeholder="Email"><br>
        <input class="formInputEmail" type="password" id="myInput" name="password" placeholder="Password">
        <input class="formInputEmail" type="text" name="phoneNumber" placeholder="Mobile number"><br>


        <br>
        <div class="buttonAlign">
            <input type="submit" id="button" value="Sign up">
        </div>
        <br>
        <div class="linktext">
            <a href="login.jsp" class="forgotPassword"> Already have an account? </a>
        </div>
    </form>
</div>

<!----------- Form end ------------>


</body>
</html>