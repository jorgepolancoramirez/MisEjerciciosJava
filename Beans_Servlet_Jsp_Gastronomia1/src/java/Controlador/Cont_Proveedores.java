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

import Entidades.Proveedores;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Cont_Proveedores extends HttpServlet {

 Proveedores op;

ArrayList<Proveedores> Listar_Proveedores = new ArrayList<Proveedores>();;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
           if (request.getParameter("Operacion").equals("Listar"))
                 {
                     for (int i = 0; i < Listar_Proveedores.size(); i++)
                     {
                     out.println("<tr><td>"+i+"</td>");
                     out.println("<td>"+Listar_Proveedores.get(i).getNombre()+"</td>");
                     out.println("<td>"+Listar_Proveedores.get(i).getCedula()+"</td>");
                     out.println("<td>"+Listar_Proveedores.get(i).getTelefono()+"</td>");
                     out.println("<td>"+Listar_Proveedores.get(i).getCiudad()+"</td>");
                     out.println("<td><a href='javascript:Eliminar_Proveedores("+i+");'>Eliminar</a></td></tr>");
                    

                     }
                 }
           
           if (request.getParameter("Operacion").equals("Eliminar"))
                 {
                     
                           int id = Integer.parseInt(request.getParameter("id"));
                           Listar_Proveedores.remove(id);
                           out.println("<h2><p style='color:white;'>Proveedor Eliminado</p></h2>");
                     
                 }
           
           
             if (request.getParameter("Operacion").equals("Registrar"))
             {
                 op  = new Proveedores();
                 op.setNombre(request.getParameter("nomb"));
                 op.setCedula(request.getParameter("cc"));
                 op.setTelefono(request.getParameter("tel"));
                 op.setCiudad(request.getParameter("ciudad"));

                 Listar_Proveedores.add(op);
                 out.println("<center><h2><p style='color:white;'> se registro el Proveedor:  " +op.getNombre()+"</p></h2></center>");   
                 
               
        }
                if (request.getParameter("Operacion").equals("Listar_Json"))
             
              {
                 String json = new Gson().toJson(Listar_Proveedores);
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
