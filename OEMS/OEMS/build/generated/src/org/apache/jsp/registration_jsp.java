package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Eventastic - Registration</title>\n");
      out.write("  <style>\n");
      out.write("    * {\n");
      out.write("      margin: 0;\n");
      out.write("      padding: 0;\n");
      out.write("      box-sizing: border-box;\n");
      out.write("      font-family: \"Segoe UI\", Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("    }\n");
      out.write("    body {\n");
      out.write("      background: linear-gradient(to right, #4facfe, #00f2fe);\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("      height: 100vh;\n");
      out.write("    }\n");
      out.write("    .container {\n");
      out.write("      background: #fff;\n");
      out.write("      padding: 30px 40px;\n");
      out.write("      border-radius: 15px;\n");
      out.write("      box-shadow: 0 8px 20px rgba(0,0,0,0.2);\n");
      out.write("      width: 400px;\n");
      out.write("    }\n");
      out.write("    .container h2 {\n");
      out.write("      text-align: center;\n");
      out.write("      margin-bottom: 20px;\n");
      out.write("      color: #333;\n");
      out.write("    }\n");
      out.write("    .form-group {\n");
      out.write("      margin-bottom: 15px;\n");
      out.write("    }\n");
      out.write("    label {\n");
      out.write("      display: block;\n");
      out.write("      font-weight: bold;\n");
      out.write("      margin-bottom: 5px;\n");
      out.write("      color: #444;\n");
      out.write("    }\n");
      out.write("    input, select, textarea {\n");
      out.write("      width: 100%;\n");
      out.write("      padding: 10px;\n");
      out.write("      border: 1px solid #ccc;\n");
      out.write("      border-radius: 8px;\n");
      out.write("      outline: none;\n");
      out.write("      transition: border 0.3s ease;\n");
      out.write("    }\n");
      out.write("    input:focus, select:focus, textarea:focus {\n");
      out.write("      border-color: #4facfe;\n");
      out.write("    }\n");
      out.write("    button {\n");
      out.write("      width: 100%;\n");
      out.write("      padding: 12px;\n");
      out.write("      background: linear-gradient(to right, #4facfe, #00f2fe);\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 8px;\n");
      out.write("      color: #fff;\n");
      out.write("      font-size: 16px;\n");
      out.write("      cursor: pointer;\n");
      out.write("      font-weight: bold;\n");
      out.write("      transition: transform 0.2s ease, background 0.3s ease;\n");
      out.write("    }\n");
      out.write("    button:hover {\n");
      out.write("      transform: scale(1.03);\n");
      out.write("      background: linear-gradient(to right, #00f2fe, #4facfe);\n");
      out.write("    }\n");
      out.write("    .note {\n");
      out.write("      font-size: 13px;\n");
      out.write("      color: #777;\n");
      out.write("      text-align: center;\n");
      out.write("      margin-top: 10px;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <h2>Eventastic Registration</h2>\n");
      out.write("    <form action=\"RegistrationServlet\" method=\"post\">\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"name\">Full Name</label>\n");
      out.write("        <input type=\"text\" id=\"name\" name=\"name\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"email\">Email Address</label>\n");
      out.write("        <input type=\"email\" id=\"email\" name=\"email\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"mobile\">Mobile Number</label>\n");
      out.write("        <input type=\"tel\" id=\"mobile\" name=\"mobile\" pattern=\"[0-9]{10}\" maxlength=\"10\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"address\">Address</label>\n");
      out.write("        <textarea id=\"address\" name=\"address\" rows=\"2\" required></textarea>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"seq\">Security Question</label>\n");
      out.write("        <select id=\"seq\" name=\"seq\" required>\n");
      out.write("          <option value=\"\">-- Select a Question --</option>\n");
      out.write("          <option value=\"pet\">What is your first pet?s name?</option>\n");
      out.write("          <option value=\"school\">What is the name of your first school?</option>\n");
      out.write("          <option value=\"city\">In which city were you born?</option>\n");
      out.write("        </select>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"seqa\">Security Answer</label>\n");
      out.write("        <input type=\"text\" id=\"seqa\" name=\"seqa\" required>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"password\">Password</label>\n");
      out.write("        <input type=\"password\" id=\"password\" name=\"password\" minlength=\"8\" maxlength=\"8\" required>\n");
      out.write("        <div class=\"note\">Password must be exactly 8 characters long</div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <button type=\"submit\">Register</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
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
