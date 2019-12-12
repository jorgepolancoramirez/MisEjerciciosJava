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

import Entidades.Insumos;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Cont_Insumos extends HttpServlet {

 Insumos Ins;

ArrayList<Insumos> Listar_Insumos = new ArrayList<Insumos>();;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
               if (request.getParameter("Operacion").equals("Listar"))
                 {
                     for (int i = 0; i < Listar_Insumos.size(); i++)
                     {
                     out.println("<tr><td>"+i+"</td>");
                     out.println("<td>"+Listar_Insumos.get(i).getCODIGO_INSUMO()+"</td>");
                     out.println("<td>"+Listar_Insumos.get(i).getNOMBRE()+"</td>");
                     out.println("<td>"+Listar_Insumos.get(i).getCANTIDAD()+"</td>");
                     out.println("<td>"+Listar_Insumos.get(i).getTIPO()+"</td>");
                     out.println("<td>"+Listar_Insumos.get(i).getFECHA_CADUCIDAD()+"</td>");
                     out.println("<td><a href='javascript:Eliminar_Insumo("+i+");'>Eliminar</a></td></tr>");
                    

                     }
                 }
           
           if (request.getParameter("Operacion").equals("Eliminar"))
                 {
                     
                           int id = Integer.parseInt(request.getParameter("id"));
                           Listar_Insumos.remove(id);
                           out.println("<h2><p style='color:white;'>Insumo Eliminado</p></h2>");
                     
                 }
           
           
             if (request.getParameter("Operacion").equals("Registrar"))
             {
                 Ins  = new Insumos();
                 Ins.setCODIGO_INSUMO(request.getParameter("cod"));
                 Ins.setNOMBRE(request.getParameter("nomb"));
                 Ins.setCANTIDAD(request.getParameter("cant"));
                 Ins.setTIPO(request.getParameter("tip"));
                 Ins.setFECHA_CADUCIDAD(request.getParameter("fech"));

                 Listar_Insumos.add(Ins);
                 out.println("<center><h2><p style='color:white;'> se registro el Insumo:  " +Ins.getNOMBRE()+"</p></h2></center>");   
                 
               
        }
                if (request.getParameter("Operacion").equals("Listar_Json"))
             
              {
                 String json = new Gson().toJson(Listar_Insumos);
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
