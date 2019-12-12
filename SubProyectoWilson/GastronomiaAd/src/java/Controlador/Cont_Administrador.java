
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entidades.Administador;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Cont_Administrador extends HttpServlet {

  Administador Admi;
  ArrayList<Administador> Listar_Administrador= new ArrayList<Administador>();;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             if(request.getParameter("Operacion").equals("Listar"))
            {
          
              for (int i = 0; i < Listar_Administrador.size();i++)
          {
              out.println("<tr><td>"+i+"</td>");
              out.println("<td>"+Listar_Administrador.get(i).getIdentificacion()+"</td>");
              out.println("<td>"+Listar_Administrador.get(i).getNombre()+"</td>");
              out.println("<td>"+Listar_Administrador.get(i).getApellido()+"</td>");
              out.println("<td>"+Listar_Administrador.get(i).getTelefono()+"</td>");
              out.println("<td>"+Listar_Administrador.get(i).getCorreo()+"</td>");
              out.println("<td><a href ='javascript:Eliminar_Admi("+i+");'>Eliminar</a></td></tr>");
              
              
              
          }
          }
              if(request.getParameter("Operacion").equals("Eliminar"))
            {
             int id = Integer.parseInt(request.getParameter("id"));
             Listar_Administrador.remove(id);
             out.println("Provedor Eliminado"); 

             
            }
          if(request.getParameter("Operacion").equals("Registrar"))
          {
          Admi =new Administador();
          Admi.setIdentificacion(request.getParameter("ide"));
          Admi.setNombre(request.getParameter("Nom"));
          Admi.setApellido(request.getParameter("Ape"));
          Admi.setTelefono(request.getParameter("Tel"));
          Admi.setCorreo(request.getParameter("Cor"));
          Listar_Administrador.add(Admi);
          out.println("<center><h3><font color: white>Se Registro el Proveedor:</font> "+Admi.getNombre()+ "</h3></center>"); 
          
          }
            if(request.getParameter("Operacion").equals("Listar_Json"))
         {
             String json = new Gson().toJson(Listar_Administrador);
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
