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

import Entidades.Recetas;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Cont_Recetas extends HttpServlet {

 Recetas rec;

ArrayList<Recetas> Listar_Recetas = new ArrayList<Recetas>();;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
               if (request.getParameter("Operacion").equals("Listar"))
                 {
                     for (int i = 0; i < Listar_Recetas.size(); i++)
                     {
                     out.println("<tr><td>"+i+"</td>");
                     out.println("<td>"+Listar_Recetas.get(i).getNOMBRE()+"</td>");
                     out.println("<td>"+Listar_Recetas.get(i).getINGREDIENTES()+"</td>");
                     out.println("<td>"+Listar_Recetas.get(i).getPREPARACION()+"</td>");
                     out.println("<td><a href='javascript:Eliminar_Recetas("+i+");'>Eliminar</a></td></tr>");
                    

                     }
                 }
           
           if (request.getParameter("Operacion").equals("Eliminar"))
                 {
                     
                           int id = Integer.parseInt(request.getParameter("id"));
                           Listar_Recetas.remove(id);
                           out.println("<h2><p style='color:white;'>Receta Eliminada</p></h2>");
                     
                 }
           
           
             if (request.getParameter("Operacion").equals("Registrar"))
             {
                 rec  = new Recetas();
                 rec.setNOMBRE(request.getParameter("nomb"));
                 rec.setINGREDIENTES(request.getParameter("ing"));
                 rec.setPREPARACION(request.getParameter("pre"));

                 Listar_Recetas.add(rec);
                 out.println("<center><h2><p style='color:white;'> se registro la Receta:  " +rec.getNOMBRE()+"</p></h2></center>");   
                 
               
        }
                if (request.getParameter("Operacion").equals("Listar_Json"))
             
              {
                 String json = new Gson().toJson(Listar_Recetas);
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
