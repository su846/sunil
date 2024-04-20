<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="registration.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <style>
    .sun{
    color: white;
    }
    </style>

</head>

<body>


      <div class="l1">
    <section>
        <form> 
            <u><h1 class="colour">REGISTER SUCCESSFUL </h1></u>
            <br>
        <label class="colour"><h2><u>Full name:</u> </h2></label>
              <h1 class="sun">${Fullname}</h1>
              <br>
      <label class="colour"><h2><u>Category: </u></h2></label>
              <h1 class="sun">${category}</h1>
        
        <label class="colour"><h2><u>Trainer:</u> </h2></label>
              <h1 class="sun">${Trainer}</h1>
        <label class="colour"><h2><u>Amount:</u> </h2></label>
              <h1 class="sun">${Amount}</h1>
          
            
                        <br>
                        <h1>Thank you</h1></form>
                

            
    </section>
</div>
</body>
</html>