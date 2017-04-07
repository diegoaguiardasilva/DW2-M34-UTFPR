<%-- 
    Document   : index
    Created on : 31/03/2017, 10:44:40
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
        <style>
            body {
                background-color: #00E89D;
                font-family: Arial;
                color: blue;
            }
        </style>
    </head>
    <body>
        
        
        <h1> CADASTRO DE ALUNO </h1>
        
        <p><a href = "ajuda.jsp">Clique aqui.</a></p>
            
            
        <form action="ServletAnotacao" method="GET">
            <table>
                <tr>
                    <th>Dado</th>
                    <th>Entrada</th>
                </tr>
                <tr>
                    <td> Nome: </td>
                    <td> <input type="text" name="nome"> </td>
                </tr>
                <tr>
                    <td> Nome da mãe: </td>
                    <td> <input type="text" name="nomemae"> </td>
                </tr>
                <tr>
                    <td> nascimento: </td> 
                    <td> <input type="date" name="nascimento"> </td>
                </tr>
                <tr>
                    <td> CPF: </td>
                    <td><input type="number" name="cpf"> </td>
                </tr>
                <tr>
                    <td> Altura(cm): </td>
                    <td><input type="number" name="altura"> </td>
                </tr>
                <tr >
                    <td> <input value = "Enviar" type="submit" name="cpf"> </td>
                </tr>
            </table>
        </form>
    </body>
</html>
