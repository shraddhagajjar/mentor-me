package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("   <style>\n");
      out.write("            #container{\n");
      out.write("                width:80%;\n");
      out.write("                margin:0px auto;\n");
      out.write("            }\n");
      out.write("            @media screen and (max-width: 700px) {\n");
      out.write("                body {\n");
      out.write("                    background-color: lightgreen;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media screen and (max-width: 480px) {\n");
      out.write("                #left{\n");
      out.write("                    width:100%;\n");
      out.write("                    margin:0px auto;\n");
      out.write("                    height:auto;\n");
      out.write("                    padding:0px;\n");
      out.write("                    background-color:#9c9;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media screen and (max-width: 480px) {\n");
      out.write("\n");
      out.write("                #right{\n");
      out.write("                    width:100%;\n");
      out.write("                    margin:0px auto;\n");
      out.write("                    float:left;\n");
      out.write("                    background-color:green;\n");
      out.write("                    height:auto;\n");
      out.write("                    padding:0px;\n");
      out.write("\n");
      out.write("                    background-color:#9c9;\n");
      out.write("                }}\n");
      out.write("            @media screen and (max-width: 480px) {\n");
      out.write("\n");
      out.write("                #center{\n");
      out.write("                    width:100%;\n");
      out.write("                    margin:0px auto;\n");
      out.write("                    float:left;\n");
      out.write("                    height:200px;\n");
      out.write("                    background:#ddd;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            #header{\n");
      out.write("                top:30px;\n");
      out.write("                width:100%;\n");
      out.write("                margin:0px auto;\n");
      out.write("            }\n");
      out.write("            ul {\n");
      out.write("                width:100%;\n");
      out.write("                list-style-type: none;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: #333;\n");
      out.write("            }\n");
      out.write("            #left{\n");
      out.write("                width:20%;\n");
      out.write("                margin:0px auto;\n");
      out.write("                float:left;\n");
      out.write("                height:500px;\n");
      out.write("                padding:0px;\n");
      out.write("\n");
      out.write("                background-color:#9c9;\n");
      out.write("            }\n");
      out.write("            #center{\n");
      out.write("                width:100%;\n");
      out.write("                margin:0px auto;\n");
      out.write("                float:left;\n");
      out.write("                height:500px;\n");
      out.write("\n");
      out.write("                background:#ddd;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            li {\n");
      out.write("                float: left;\n");
      out.write("\n");
      out.write("                margin: 0px auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a {\n");
      out.write("                display: block;\n");
      out.write("                color: white;\n");
      out.write("                font-size:20px;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a:hover:not(.active) {\n");
      out.write("                background-color: #111;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .active {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("            }\n");
      out.write("            #footer {\n");
      out.write("                width:100%;\n");
      out.write("                height:100px;\n");
      out.write("                clear:both;\n");
      out.write("                top:40px;\n");
      out.write("                background:black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>:: About US ::</title>\n");
      out.write("        <title>Home page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id =\"container\">\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("   \n");
      out.write("<style>\n");
      out.write("#container{\n");
      out.write("\twidth:80%;\n");
      out.write("\tmargin:0px auto;\n");
      out.write("}\n");
      out.write("@media screen and (max-width: 700px) {\n");
      out.write("    body {\n");
      out.write("        background-color: lightgreen;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("@media screen and (max-width: 480px) {\n");
      out.write("#left{\n");
      out.write("\twidth:100%;\n");
      out.write("\tmargin:0px auto;\n");
      out.write("\theight:auto;\n");
      out.write("\tpadding:0px;\n");
      out.write("\tbackground-color:#9c9;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("@media screen and (max-width: 480px) {\n");
      out.write("\n");
      out.write("#right{\n");
      out.write("\twidth:100%;\n");
      out.write("\tmargin:0px auto;\n");
      out.write("\tfloat:left;\n");
      out.write("\tbackground-color:green;\n");
      out.write("\theight:auto;\n");
      out.write("\tpadding:0px;\n");
      out.write("\t\n");
      out.write("\tbackground-color:#9c9;\n");
      out.write("}}\n");
      out.write("@media screen and (max-width: 480px) {\n");
      out.write("\n");
      out.write("#center{\n");
      out.write("\twidth:100%;\n");
      out.write("\tmargin:0px auto;\n");
      out.write("\tfloat:left;\n");
      out.write("\theight:200px;\n");
      out.write("\tbackground:#ddd;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("#header{\n");
      out.write("\ttop:30px;\n");
      out.write("\twidth:100%;\n");
      out.write("\tmargin:0px auto;\n");
      out.write("}\n");
      out.write("ul {\n");
      out.write("\twidth:100%;\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #333;\n");
      out.write("}\n");
      out.write("li {\n");
      out.write("    float: left;\n");
      out.write("\t\n");
      out.write("    margin: 0px auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("    display: block;\n");
      out.write("    color: white;\n");
      out.write("\tfont-size:20px;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover:not(.active) {\n");
      out.write("    background-color: #111;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("}\n");
      out.write("#footer {\n");
      out.write("width:100%;\n");
      out.write("height:100px;\n");
      out.write("clear:both;\n");
      out.write("top:40px;\n");
      out.write("background:#cc9;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div id = \"header\">\n");
      out.write("<ul>\n");
      out.write("    <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("    <li><a href=\"student.jsp\">Student</a></li>\n");
      out.write("    <li><a href=\"tutor.jsp\">Tutor</a></li>\n");
      out.write("    <li><a  href=\"aboutus.jsp\">About US </a></li>\n");
      out.write("    <li><a href=\"news.jsp\">News</a></li>  \n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <div id =\"main\">\n");
      out.write("<div id =\"center\">\n");
      out.write("<h1><center>What is Mentor Me</center></h1>\n");
      out.write("</div> \n");
      out.write("</div>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div id=\"footer\">\n");
      out.write("        <center>\n");
      out.write("            <br/>\n");
      out.write("            <a href=\"home.jsp\"  title=\"Home\">\n");
      out.write("                <font color=\"#FFFFFF\">Home</a></font></a>&nbsp;&nbsp;|\n");
      out.write("            <a href=\"student.jsp\" title=\"Student\"><font color=\"#FFFFFF\">Student</font></a>&nbsp;&nbsp;|\n");
      out.write("            <a href=\"tutor.jsp\" title=\"Tutor\"><font color=\"#FFFFFF\">Tutor</font></a>&nbsp;&nbsp;|\n");
      out.write("            <a href=\"aboutus.jsp\" title=\"About Mentor Me\"><font color=\"#FFFFFF\">About Us</font></a>&nbsp;&nbsp;|\n");
      out.write("            <a href=\"news.jsp\" title=\"News\"><font color=\"#FFFFFF\">News</font></a></font></</center>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("    </center>\n");
      out.write("    <center>\n");
      out.write("        <font color=\"#CCCCCC\"> &copy; - All rights reserved.| Powered by | Mentor Me.(Get your Problem's solution).</font></center>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    </body>\n");
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
