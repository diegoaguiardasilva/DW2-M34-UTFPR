package br.com.utfpr.mavenproject1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author diego
 */
public class Importa extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse respons)
            throws ServletException, IOException {
            String nome = request.getParameter("nome");
            String sobrenome = request.getParameter("sobrenome");
            String nascimento = request.getParameter("nascimento");
            String cpf = request.getParameter("cpf");
    }
    
}
