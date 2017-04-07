/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.mavenproject1;

import Persistencia.Aluno;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author diego
 */
@WebServlet(name = "ServletAnotacao", urlPatterns = {"/ServletAnotacao"})
public class ServletAnotacao extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            
            
            String nome = request.getParameter("nome");
            String nomemae = request.getParameter("nomemae");
            String nascimento = request.getParameter("nascimento");
            String cpf = request.getParameter("cpf");
            String altura = request.getParameter("altura");
            
            
            
            
            Aluno aluno = new Aluno();
            
            aluno.setRa(Integer.valueOf(cpf));
            aluno.setNome(nome);
            aluno.setDataNasc(nascimento);
            aluno.setNomeMae(nomemae);
            aluno.setAltura(Double.valueOf(altura));
            
            
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
            out.println("<p> Nome: "+nome+"</p>");
            out.println("<p> CPF: "+cpf+"</p>");
            out.println("<p> Nascimento: "+nascimento+"</p>");
            out.println("<p> Nome da mae: "+nomemae+"</p>");
            out.println("<p> Altura(cm): "+altura+"</p>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
