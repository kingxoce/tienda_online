/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controladoradmin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import wsservicios.Wsadmin_Service;

/**
 *
 * @author jpmon
 */
public class ttt extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            RequestDispatcher  rd=null; 
            int smin,smax,idpr,idpe,exist;
            String fechaad,chad;
            float cost,porc;
            cost=Float.parseFloat(request.getParameter("txtcost"));
            porc=Float.parseFloat(request.getParameter("txtporc"));
            smin=Integer.parseInt(request.getParameter("txtsmin"));
            smax=Integer.parseInt(request.getParameter("txtsmax"));
            exist=Integer.parseInt(request.getParameter("txxexist"));
           
           idpe=Integer.parseInt(request.getParameter("txtidpre"));
            idpr=Integer.parseInt(request.getParameter("txtPro"));
          
            
            
            int respuesta =0;
                  
            
            
            
            
            fechaad=request.getParameter("txtfad");  
           Wsadmin_Service em = new Wsadmin_Service();
           respuesta = em.getWsadminPort().firspricestock(fechaad, cost, smin, smax, idpe, porc, exist, idpr) ;
            
            request.setAttribute("respuesta", respuesta);
           rd=request.getRequestDispatcher("newproduct.jsp");
           rd.forward(request, response); 
            
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
