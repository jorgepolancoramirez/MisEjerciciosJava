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

import Entidades.Examen;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Cont_Examen extends HttpServlet {


 Examen ex;

ArrayList<Examen> Listar_Unidades_Productivas = new ArrayList<Examen>();;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
                       if (request.getParameter("Operacion").equals("Listar"))
                 {
                     for (int i = 0; i < Listar_Unidades_Productivas.size(); i++)
                     {
                     out.println("<tr><td>"+i+"</td>");
                     out.println("<td>"+Listar_Unidades_Productivas.get(i).getCODIGO()+"</td>");
                     out.println("<td>"+Listar_Unidades_Productivas.get(i).getNOMBRE_UNIDAD()+"</td>");
                     out.println("<td>"+Listar_Unidades_Productivas.get(i).getNOMBRE_PRODUCTO()+"</td>");
                     out.println("<td>"+Listar_Unidades_Productivas.get(i).getCANTIDAD_DE_PRODUCCION()+"</td>");
                     out.println("<td>"+Listar_Unidades_Productivas.get(i).getPRECIO()+"</td>");
                     out.println("<td>"+Listar_Unidades_Productivas.get(i).getFECHA()+"</td>");
                     out.println("<td>"+Listar_Unidades_Productivas.get(i).getVALOR_PRODUCTO()+"</td>");
                     out.println("<td>"+Listar_Unidades_Productivas.get(i).getPROMEDIO_PRODUCTO()+"</td>");
                     
                    
                    
                     out.println("<td><a href='javascript:Eliminar_Unidades_Productivas("+i+");'>Eliminar</a></td></tr>");
                    

                     }
                 }
                       if (request.getParameter("Operacion").equals("Registrar"))
             {
                 
                 ex  = new Examen();
                 ex.setCODIGO(Float.parseFloat(request.getParameter("cod")));
                 ex.setNOMBRE_UNIDAD(request.getParameter("nom_uni"));
                 ex.setNOMBRE_PRODUCTO(request.getParameter("nom_pro"));
                 ex.setCANTIDAD_DE_PRODUCCION(Float.parseFloat(request.getParameter("can_pro")));
                 ex.setPRECIO(Float.parseFloat(request.getParameter("precio")));
                 ex.setFECHA(request.getParameter("fecha"));
                 ex.setVALOR_PRODUCTO ((ex.getCANTIDAD_DE_PRODUCCION()*ex.getPRECIO()));
                 ex.setPROMEDIO_PRODUCTO ((ex.getVALOR_PRODUCTO()/ex.getCANTIDAD_DE_PRODUCCION()) );
                
                 
                 

                 Listar_Unidades_Productivas.add(ex);
                 out.println("<center><h2><p style='color:white;'> se registro el Proveedor:  " +ex.getNOMBRE_UNIDAD()+"</p></h2></center>");   
                 
               
        }
                if (request.getParameter("Operacion").equals("Listar_Json"))
             
              {
                 String json = new Gson().toJson(Listar_Unidades_Productivas);
                 out.println(json);
             }
                       
                       
                       
           if (request.getParameter("Operacion").equals("Eliminar"))
                 {
                     
                           int id = Integer.parseInt(request.getParameter("id"));
                           Listar_Unidades_Productivas.remove(id);
                           out.println("<h2><p style='color:white;'>Unidad productiva Eliminada</p></h2>");
                     
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
