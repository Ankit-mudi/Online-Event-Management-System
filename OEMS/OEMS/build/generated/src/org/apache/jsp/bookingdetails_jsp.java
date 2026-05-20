package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.http.*;

public final class bookingdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    // Check if user is logged in
    HttpSession session = request.getSession(false);
    if (session == null || session.getAttribute("userEmail") == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    String userEmail = (String) session.getAttribute("userEmail");

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>My Booking Details - Eventastic</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #fdf8f5;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        .header {\n");
      out.write("            background-color: #b48c8c;\n");
      out.write("            color: white;\n");
      out.write("            padding: 15px 30px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-between;\n");
      out.write("        }\n");
      out.write("        .header img {\n");
      out.write("            height: 50px;\n");
      out.write("        }\n");
      out.write("        .header h1 {\n");
      out.write("            font-size: 24px;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 1200px;\n");
      out.write("            margin: 30px auto;\n");
      out.write("            padding: 0 20px;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            background: white;\n");
      out.write("            box-shadow: 0 2px 8px rgba(0,0,0,0.1);\n");
      out.write("            border-radius: 10px;\n");
      out.write("            overflow: hidden;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            padding: 12px 15px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background-color: #b48c8c;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: #f9f0f0;\n");
      out.write("        }\n");
      out.write("        .back-btn {\n");
      out.write("            display: inline-block;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            padding: 10px 25px;\n");
      out.write("            background: #b48c8c;\n");
      out.write("            color: white;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        .back-btn:hover {\n");
      out.write("            background: #9c6d6d;\n");
      out.write("        }\n");
      out.write("        .no-booking {\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 50px;\n");
      out.write("            font-size: 22px;\n");
      out.write("            color: #b48c8c;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Header -->\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <img src=\"logo.png\" alt=\"Eventastic Logo\">\n");
      out.write("        <h1>My Booking Details</h1>\n");
      out.write("        <span>Welcome, ");
      out.print( userEmail );
      out.write("</span>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        ");

            boolean hasBooking = false;
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");

                String sql = "SELECT event, vname, vprice, cfi, cfp, dpk, dpr, spk, spr, guests " +
                             "FROM registration WHERE email=? AND payment='paid'";
                ps = conn.prepareStatement(sql);
                ps.setString(1, userEmail);
                rs = ps.executeQuery();

                if(rs.next()) {
                    hasBooking = true;
        
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Event</th>\n");
      out.write("                <th>Venue</th>\n");
      out.write("                <th>Venue Price</th>\n");
      out.write("                <th>Food Items</th>\n");
      out.write("                <th>Food Price</th>\n");
      out.write("                <th>Decoration</th>\n");
      out.write("                <th>Decoration Price</th>\n");
      out.write("                <th>Photography</th>\n");
      out.write("                <th>Photography Price</th>\n");
      out.write("                <th>Guests</th>\n");
      out.write("                <th>Total Price</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                    do {
                        String event = rs.getString("event");
                        String vname = rs.getString("vname");
                        int vprice = rs.getInt("vprice");
                        String cfi = rs.getString("cfi");
                        int cfp = rs.getInt("cfp");
                        String dpk = rs.getString("dpk");
                        int dpr = rs.getInt("dpr");
                        String spk = rs.getString("spk");
                        int spr = rs.getInt("spr");
                        int guests = rs.getInt("guests");
                        int total = vprice + (cfp*guests) + dpr + spr;
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( event );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( vname );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( vprice );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( cfi );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( cfp );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( dpk );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( dpr );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( spk );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( spr );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( guests );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( total );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                    } while(rs.next());
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        ");

                } 

                if(!hasBooking) {
        
      out.write("\n");
      out.write("            <div class=\"no-booking\">You have not booked any event yet.</div>\n");
      out.write("        ");

                }
            } catch(Exception e) {
                e.printStackTrace();
        
      out.write("\n");
      out.write("            <div class=\"no-booking\">Error fetching booking details.</div>\n");
      out.write("        ");

            } finally {
                if(rs != null) try{ rs.close(); } catch(Exception e){}
                if(ps != null) try{ ps.close(); } catch(Exception e){}
                if(conn != null) try{ conn.close(); } catch(Exception e){}
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <a href=\"userhome.jsp\" class=\"back-btn\">Back</a>\n");
      out.write("    </div>\n");
      out.write("\n");
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
