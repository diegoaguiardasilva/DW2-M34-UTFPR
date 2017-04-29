/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Entidades.Usuario;
import daos.DAOUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author diego
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    DAOUsuario da;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String nome = request.getParameter("nome");
            String cpf = request.getParameter("cpf");
            String telefone = request.getParameter("telefone");
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            String dataEmTexto = request.getParameter("nascimento");

            Date nascimento = new SimpleDateFormat("yyyy-mm-dd").parse(dataEmTexto);

            Usuario us = new Usuario();

            us.setNome(nome);
            us.setCpf(cpf);
            us.setNascimento(nascimento);
            us.setTelefone(telefone);
            us.setEmail(email);
            us.setSenha(senha);

            da = new DAOUsuario();
            da.inserir(us);
            
            
            Usuario usa = da.obter(us.getIdUsuario());

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Enviado com sucesso!</title>");
            out.println("<style>");
            out.println("body {");
            out.println("background-color: #00E89D;");
            out.println("font-family: Arial;");
            out.println("color: blue;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Enviado com sucesso!</h1>");
            out.println("<h2>Dados do último usuário adicoinado.</h2>");
            out.println("<p> Id: " + usa.getIdUsuario()+ "</p>");
            out.println("<p> Nome: " + usa.getNome() + "</p>");
            out.println("<p> CPF: " + usa.getCpf() + "</p>");
            out.println("<p> Nascimento: " + new SimpleDateFormat("dd/mm/yyyy").format(usa.getNascimento()) + "</p>");
            out.println("<p> Telefone: " + usa.getTelefone() + "</p>");
            out.println("<p> Email: " + usa.getEmail() + "</p>");
            out.println("<p> Senha: " + usa.getSenha() + "</p>");
            out.println("<h3><a href=\"" + request.getContextPath() + "\">cadastrar novo</a></h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }


// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);

        } catch (ParseException ex) {
            Logger.getLogger(Servlet.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);

        } catch (ParseException ex) {
            Logger.getLogger(Servlet.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
