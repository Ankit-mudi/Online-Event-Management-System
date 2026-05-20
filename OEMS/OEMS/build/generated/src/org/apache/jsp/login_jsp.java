package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Login - Event Management</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background: #f0f0f0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container {\n");
      out.write("            width: 320px;\n");
      out.write("            margin: 100px auto;\n");
      out.write("            background: white;\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0,0,0,0.2);\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container i.user-icon {\n");
      out.write("            font-size: 40px;\n");
      out.write("            color: #007bff;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            margin-bottom: 25px;\n");
      out.write("            font-size: 24px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-group {\n");
      out.write("            position: relative;\n");
      out.write("            margin: 15px 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-group i {\n");
      out.write("            position: absolute;\n");
      out.write("            left: 10px;\n");
      out.write("            top: 50%;\n");
      out.write("            transform: translateY(-50%);\n");
      out.write("            color: #999;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input-group input {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px 10px 10px 35px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 4px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .link {\n");
      out.write("            margin-top: 10px;\n");
      out.write("            display: block;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"login-container\">\n");
      out.write("        <i class=\"fas fa-user-circle user-icon\"></i>\n");
      out.write("        <h2>Login</h2>\n");
      out.write("\n");
      out.write("        <form action=\"LoginServlet\" method=\"post\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <i class=\"fas fa-envelope\"></i>\n");
      out.write("                <input type=\"text\" name=\"email\" placeholder=\"Enter Email\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <i class=\"fas fa-lock\"></i>\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Enter Password\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Login\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <a class=\"link\" href=\"registration.jsp\">Don't have an account? Register</a>\n");
      out.write("        <a class=\"link\" href=\"fp.jsp\">Forgot Password?</a>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");
 
        String error = request.getParameter("error");
        if ("1".equals(error)) { 
    
      out.write("\n");
      out.write("        <script>\n");
      out.write("            alert(\"Invalid Email or Password!\");\n");
      out.write("        </script>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
