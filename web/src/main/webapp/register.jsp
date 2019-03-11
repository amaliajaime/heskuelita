<%--
  Created by IntelliJ IDEA.
  User: Amalia
  Date: 10/3/2019
  Time: 01:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html lang="es">

<head>
    <meta charset="utf-8">
    <title> Escuela Java - Capgemini </title>

    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scala=1.0, minimun-scale=1.0">

    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>


    <h1><center> Escuela Java - Capgemini  </center></h1>

    <h2>
        <center> Formulario de inscripcion </br> </center>
    </h2>



</head>


<body>
<h2> Datos: </h2>

<form action="register" class=""role="form"method="post">
    <div class="form-group">
        <label class=""for="name">Name: </label>
        <input class="form-control"id="nombre"type="text" placeholder="Name" name="ctrlName">
    </div>

    <div class="">
        <label class=""for="last name">Last name: </label>
        <input class="form-control"id="last nombre"type="text" placeholder="Last name" name ="ctrlLastName">
    </div>



    <div class="form-group">
        <label class=""for="last name">Birthdate: </label>
        <input class="form-control"id="birthday"type="date" placeholder="" name="ctrlBirthdate">
        <br>

        <label class=""for= "option">Documentation type:</label>
        <select class="form-control" name="ctrlDoc"id="documentation">
            <option value="dni">DNI</option>
            <option value="pasaport">Pasaport</option>
        </select>
        <br>

        <label class=""for="identification">Identification:</label>
        <input class="form-control" id="identification"type="tel"placeholder="Identification" name="ctrlIdentif">
        <br>

        <label class=""for="telephone">Telephone:</label>
        <input class="form-control" id="telephone"type="tel"placeholder="Telephone"name ="ctrlTelephone">
        <br>

        <div class="radio">
            <label>
                Gender: <input type="radio" name="ctrlGender" id="Mujer" value="mujer"checkedn>
                Mujer
            </label>
        </div>

        <div class="radio">
            <label>
                <input type="radio" name="ctrlGender"id="Hombre"value="hombre"checked>
                Hombre
            </label>
        </div>

        <div class="radio">
            <label>
                <input type="radio" name="ctrlGender" id="Otro" value="otro"checked>
                Otro
            </label>
        </div>


        <label class=""for="username">Username:</label>
        <input class="form-control" id="username"type="text"placeholder="Username" name=" ctrlUserName">
        <br>

        <label class=""for="email">Email:</label>
        <input class="form-control" id="email"type="text"placeholder="Email" name = "ctrlEmail">
        <br>

        <label class=""for="password">Password:</label>
        <input class="form-control" id="password"type="text"placeholder="Password" name="ctrlPsw">
        <br>

        <br>
    </div>

    </br>

        <button type="submit" class="btn btn-primary">Siguiente</button>

</form>


<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>

</boody>

</html>