/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entidades.Elementos;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Cont_Elementos extends HttpServlet {
    Elementos Elemen;
    ArrayList<Elementos> Listar_Elementos= new ArrayList<Elementos>();;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            if(request.getParameter("Operacion").equals("Listar"))
            {
          
              for (int i = 0; i < Listar_Elementos.size();i++)
          {
              out.println("<tr><td>"+i+"</td>");
              out.println("<td>"+Listar_Elementos.get(i).getCodigo()+"</td>");
              out.println("<td>"+Listar_Elementos.get(i).getNombre()+"</td>");
              out.println("<td>"+Listar_Elementos.get(i).getValor()+"</td>");
              out.println("<td>"+Listar_Elementos.get(i).getCantidad()+"</td>");
              out.println("<td><a href ='javascript:Eliminar_Elemen("+i+");'>Eliminar</a></td></tr>");     
          }
           }
            if(request.getParameter("Operacion").equals("Eliminar"))
            {
             int id = Integer.parseInt(request.getParameter("id"));
             Listar_Elementos.remove(id);
             out.println(" <font color: red >Elemento Eliminado </font>"); 
             
            }
          if(request.getParameter("Operacion").equals("Registrar"))
          {
          Elemen =new Elementos();
          Elemen.setCodigo(request.getParameter("Cod"));
          Elemen.setNombre(request.getParameter("Nom"));
          Elemen.setValor(request.getParameter("Val"));
          Elemen.setCantidad(request.getParameter("Can"));
          Listar_Elementos.add(Elemen);
          out.println("<center><h3><font color: red >Se Registro El :</font> "+Elemen.getNombre()+ "</h3></center>"); 
          
          }
            if(request.getParameter("Operacion").equals("Listar_Json"))
         {
             String json = new Gson().toJson(Listar_Elementos);
             out.println(json);
             
         }
            
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
