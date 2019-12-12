package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"Css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("   <body background=\"gastro1.jpg\">\n");
      out.write("        <form>\n");
      out.write("            <tr>\n");
      out.write("            <center>\n");
      out.write("                <font color=\"black\" size=\"6\"><h1>FORMULARIO DE REGISTRO DE ELEMENTOS</h1></font>\n");
      out.write("                <table>\n");
      out.write("                    <tr><td><font color=\"black\" size=\"4\">CODIGO</font></td> <td><input type=\"text\" id=\"Codigo\"/></td></tr>\n");
      out.write("                    <tr><td><font color=\"black\" size=\"4\">NOMBRE</font></td> <td><input type=\"text\" id=\"Nombre\"/></td></tr>\n");
      out.write("                    <tr><td><font color=\"black\" size=\"4\">VALOR</font></td> <td><input type=\"number\" id=\"Valor\"/></td></tr>\n");
      out.write("                    <tr><td><font color=\"black\" size=\"4\">CANTIDAD</font></td> <td><input type=\"number\" id=\"Cantidad\"/></td></tr>\n");
      out.write("                    <tr><td colspan=\"3\" aling=\"center\"> <button type=\"button\" class=\"boton1\" onclick=\"Registrar_Elementos()\">\n");
      out.write("                                REGISTAR</button></td>\n");
      out.write("                    <td colspan=\"3\" aling=\"center\"> <button type=\"button\" class=\"boton1\" onclick=\"Listar_Elementos()\">\n");
      out.write("                                LISTAR</button></td>\n");
      out.write("                                <td colspan=\"3\" aling=\"center\"> <button type=\"button\" class=\"boton1\" onclick=\"Listar_Elementos_Json()\">\n");
      out.write("                                LISTAR_JSON</button></td> \n");
      out.write("                    </tr>               \n");
      out.write("                </table>\n");
      out.write("                <div id=\"respuesta_servidor\"></div>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("        <center>\n");
      out.write("        <hr>\n");
      out.write("        <table border=\"1\" bgcolor=\"white\">\n");
      out.write("            <caption><font color=\"black\" size=\"4\"><h3>LISTA DE ELEMENTOS</h3></font></caption>\n");
      out.write("            <thead color=\"white\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Codigo</th>\n");
      out.write("                    <th>Nombre</th>\n");
      out.write("                    <th>Valor</th>\n");
      out.write("                    <th>Cantidad</th>\n");
      out.write("                    <th>Admin</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody id=\"Listar_Elementos\"> <!-- cuerpo de la tabla-->\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("    </body> \n");
      out.write("        <script src=\"Js/Elementos.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"Js/jquery-3.4.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
