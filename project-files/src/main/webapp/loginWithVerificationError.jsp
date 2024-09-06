<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Main</title>
    <link rel="stylesheet" href="loginVerificationError.css">
</head>
<body>

<div class="WelcomeSection">
    <div><h2 id="titleColor">Welcome to login!</h2></div>
</div>


<div class="authentication">

    <button class="flash-close" type="button">
        <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-x">
            <path fill-rule="evenodd" d="M3.72 3.72a.75.75 0 011.06 0L8 6.94l3.22-3.22a.75.75 0 111.06 1.06L9.06 8l3.22 3.22a.75.75 0 11-1.06 1.06L8 9.06l-3.22 3.22a.75.75 0 01-1.06-1.06L6.94 8 3.72 4.78a.75.75 0 010-1.06z"></path>
        </svg>
    </button>

    <script>
        /* Get all elements with class name */

        function validateform() {
            event.preventDefault();

            var password = document.getElementById("password").value;
            var repeatePassword = document.getElementById("cnfrmPassword").value;
            console.log(password, repeatePassword)
            if (password != repeatePassword) {
                this.parentElement.style.display = 'visible';
            }


        }


    </script>

    Account is not verified. You must first verify your account in order to login.
</div>

<!----------- Form start ------------>

<div class="FormSection">
    <form class="form" action="" method="post">
        <input class="formInputEmail" type="text" name="email" placeholder="Email address"><br>
        <input class="formInputEmail" type="password" id="myInput" name="password" placeholder="Password">

        <br>
        <div>
            <input type="submit" id="button" value="Log In">
        </div>
        <br>
        <div class="linktext">
            <a href="index.jsp" class="forgotPassword"> Forgotten password? </a>
        </div>
        <div class="loginSignUpSeparator">
            <span class="textInSeparator">or</span>
        </div>

        <div>

            <button onclick="location.href='registration.jsp'" type="button" id="button2">
                Sign up
            </button>
        </div>
    </form>
</div>

<!----------- Form end ------------>


</body>
</html>