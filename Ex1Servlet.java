/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author christina
 */
@WebServlet(name = "Ex1Servlet", urlPatterns = {"/Ex1Servlet"})
public class Ex1Servlet extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ex1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=\"verify.jsp\" method=\"post\">");
            out.println("<label for=\"user_name\">User name: </label>");
            out.println("<input type=\"text\" name=\"user_name\">");
            out.println("<br>");
            out.println("<label for=\"create_password\">Create password: </label>");
            out.println("<input type=\"password\" name=\"create_password\">");
            out.println("<br>");
            out.println("<label for=\"reenter_password\">Reenter password: </label>");
            out.println("<input type=\"password\" name=\"reenter_password\">");
            out.println("<br>");
            out.println("<label for=\"phone\">Phone: </label>");
            out.println("<input type=\"number\" name=\"phone\">");
            out.println("<br>");
            out.println("<input type=\"submit\" value=\"envoyer\">");
            out.println("<input type=\"reset\" name=\"reset\">");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

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
    }

}
