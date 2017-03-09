/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mentor_me.mentor;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shraddha
 */
@WebServlet(name = "MentorLogin", urlPatterns = {"/MentorLogin"})
public class MentorLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static final String CONTENT_TYPE = "text/html";
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = null;
    private static final String CONN_STRING = "jdbc:mysql://localhost/mentor_me";

    java.sql.Statement s, statement1, statement2;
    java.sql.ResultSet rs, resultset1, resultset2;
    java.sql.PreparedStatement pst, prepared1, preapred2;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType(CONTENT_TYPE);
            PrintWriter out = response.getWriter();
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);

            String username = (String) request.getParameter("name");
            String password = (String) request.getParameter("password");
            pst = connection.prepareStatement("select * from `tutor_details` where  `username` = ? and `password` = ?");
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rset = pst.executeQuery();

            if (rset.next()) {
                int id = Integer.parseInt(rset.getString(1));
                String FirstName = (String) rset.getString(2);
                String userName = (String) rset.getString(4);
                HttpSession session = request.getSession();
                session.setAttribute("tutorId", id);
                session.setAttribute("tutorName", FirstName);
                session.setAttribute("tutorUserName", userName);
                out.println("Working");
                response.sendRedirect("faces/tutor/html/TutorHome.jsp");
            } else {
                /*String nextJSP = "site/html/home.jsp";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
                dispatcher.forward(request, response);*/
                response.sendRedirect("faces/site/html/home.jsp");
            }
        } catch (Exception e) {

        }

    }

}
