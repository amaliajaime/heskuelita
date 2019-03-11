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

<form action="register" class=""role="form">
    <div class="form-group">
        <label class=""for="name">Name: </label>
        <input class="form-control"id="nombre"type="text" placeholder="Name">
    </div>

    <div class="">
        <label class=""for="last name">Last name: </label>
        <input class="form-control"id="last nombre"type="text" placeholder="Last name">
    </div>
</form>

<form action="resgister" class="">
    <div class="form-group">
        <label class=""for="last name">Birthday: </label>
        <input class="form-control"id="birthday"type="date" placeholder="">
        <br>

        <label class=""for= "option">Documentation type:</label>
        <select class="form-control" name=""id="documentation">
            <option value="dni">DNI</option>
            <option value="pasaport">Pasaport</option>
        </select>
        <br>

        <label class=""for="identification">Identification:</label>
        <input class="form-control" id="identification"type="tel"placeholder="Identification">
        <br>

        <label class=""for="telephone">Telephone:</label>
        <input class="form-control" id="telephone"type="tel"placeholder="Telephone">
        <br>

        <div class="radio">
            <label>
                Sexo: <input type="radio" name="sexo" id="Mujer" value="mujer"checked>
                Mujer
            </label>
        </div>

        <div class="radio">
            <label>
                <input type="radio" name="sexo"id="Hombre"value="hombre"checked>
                Hombre
            </label>
        </div>

        <div class="radio">
            <label>
                <input type="radio" name="sexo" id="Otro" value="otro"checked>
                Otro
            </label>
        </div>

        <div class="form-group">
            <label for="select">Country:

                <select class="form-control">
                    <option value="1">--Seleccionar--</option>
                    <option value="2">Argentina</option>
                    <option value="3">Brasil</option>
                    <option value="4">Chile</option>
                    <option value="5">Bolivia</option>
                    <option value="6">Peru</option>

                </select>
            </label>
        </div>

        <label class=""for="state">State:</label>
        <input class="form-control" id="state"type="text"placeholder="State">
        <br>

        <label class=""for="city">City:</label>
        <input class="form-control" id="city"type="text"placeholder="City">
        <br>

        <label class=""for="adrees">Adress:</label>
        <input class="form-control" id="adress"type="text"placeholder="street, number, zipcode">
        <br>

        <label class=""for="username">Username:</label>
        <input class="form-control" id="username"type="text"placeholder="Username">
        <br>

        <label class=""for="email">Email:</label>
        <input class="form-control" id="email"type="text"placeholder="Email">
        <br>

        <label class=""for="password">Password:</label>
        <input class="form-control" id="password"type="number"placeholder="Password">
        <br>

        <label for:"Archivo"> Picture:</label>
        <input type="file" id="archivo">

        <br>


</br>

<button action = "" class="btn btn-primary">Siguiente</button>

</form>


<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>

</boody>

</html>