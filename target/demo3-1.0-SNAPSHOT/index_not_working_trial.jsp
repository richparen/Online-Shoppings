<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="mycss.css">
        <title>JSP Page</title>
    </head>
    <body>

        <div id="invalid_login"> </div>

        <div id="login_in">
              <form name="Login_Form" action="Controller" method="Post">
    
 <div class="form-group">
                            <label for="userName">Username:</label> 
                            <input type="text" maxlength="40" class="form-control" name="login_name" />
                            <label for="password">Password:</label> 
                            <input type="password" maxlength="40" class="form-control" name="login_password" />
                <input type="submit" name="login_submit" value="Submit" class="form-control" onclick="return form_validation()" >             
            </div>
            </form>
            </div>
  <footer  class="text-center">
            <div class="container col-lg-12 col-md-12 col-xs-12 no-padding">
        <strong>Copyright &copy;  2021.</strong> All rights reserved.
      </div>
    </footer>
        </body>
</html>
