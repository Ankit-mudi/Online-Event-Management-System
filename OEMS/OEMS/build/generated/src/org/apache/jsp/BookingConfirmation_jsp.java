package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BookingConfirmation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Booking Confirmation</title>\n");
      out.write("  <style>\n");
      out.write("    body {\n");
      out.write("      font-family: 'Segoe UI', sans-serif;\n");
      out.write("      background: #f5f7fa;\n");
      out.write("      margin: 0;\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("      min-height: 100vh;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .confirmation-container {\n");
      out.write("      background: #fff;\n");
      out.write("      padding: 40px;\n");
      out.write("      border-radius: 20px;\n");
      out.write("      box-shadow: 0px 6px 25px rgba(0,0,0,0.15);\n");
      out.write("      width: 400px;\n");
      out.write("      text-align: center;\n");
      out.write("      animation: fadeIn 0.5s ease;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .tick {\n");
      out.write("      width: 100px;\n");
      out.write("      height: 100px;\n");
      out.write("      border-radius: 50%;\n");
      out.write("      border: 6px solid #4CAF50;\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("      margin: 0 auto 20px auto;\n");
      out.write("      position: relative;\n");
      out.write("      animation: popIn 0.6s ease-out;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .tick::after {\n");
      out.write("      content: \"\";\n");
      out.write("      width: 30px;\n");
      out.write("      height: 60px;\n");
      out.write("      border-right: 6px solid #4CAF50;\n");
      out.write("      border-bottom: 6px solid #4CAF50;\n");
      out.write("      transform: rotate(45deg);\n");
      out.write("      position: absolute;\n");
      out.write("      top: 10px;\n");
      out.write("      animation: draw 0.8s ease forwards;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h2 {\n");
      out.write("      color: #333;\n");
      out.write("      margin-bottom: 10px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    p {\n");
      out.write("      color: #555;\n");
      out.write("      font-size: 16px;\n");
      out.write("      margin-bottom: 25px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .btn {\n");
      out.write("      padding: 12px 25px;\n");
      out.write("      background: #4a90e2;\n");
      out.write("      color: white;\n");
      out.write("      border-radius: 10px;\n");
      out.write("      text-decoration: none;\n");
      out.write("      transition: 0.3s;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .btn:hover {\n");
      out.write("      background: #357abd;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    @keyframes popIn {\n");
      out.write("      from { transform: scale(0.5); opacity: 0; }\n");
      out.write("      to { transform: scale(1); opacity: 1; }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    @keyframes draw {\n");
      out.write("      from { height: 0; width: 0; }\n");
      out.write("      to { height: 60px; width: 30px; }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    @keyframes fadeIn {\n");
      out.write("      from { opacity: 0; transform: translateY(20px); }\n");
      out.write("      to { opacity: 1; transform: translateY(0); }\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"confirmation-container\">\n");
      out.write("    <div class=\"tick\"></div>\n");
      out.write("    <h2>Payment Successful!</h2>\n");
      out.write("    <p>Your Event has been booked successfully.</p>\n");
      out.write("    <a href=\"userhome.jsp\" class=\"btn\">Go to Home</a>\n");
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
