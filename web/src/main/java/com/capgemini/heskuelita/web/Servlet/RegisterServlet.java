package com.capgemini.heskuelita.web.Servlet;

import com.capgemini.heskuelita.core.beans.User;
import com.capgemini.heskuelita.data.db.DBConnectionManager;
import com.capgemini.heskuelita.data.impl.UserDaoJDBC;
import com.capgemini.heskuelita.service.ISecurityService;
import com.capgemini.heskuelita.service.impl.SecurityServiceImpl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;


@WebServlet ("/register")
public class RegisterServlet extends HttpServlet {

    private ISecurityService securityService;

    public RegisterServlet() {
        super() ;
    }

    @Override
    public void init (ServletConfig config) throws ServletException {

        ServletContext context = config.getServletContext();

        DBConnectionManager manager = (DBConnectionManager) context.getAttribute("db");

        try {

            this.securityService = new SecurityServiceImpl (new UserDaoJDBC(manager.getConnection())) ;
        } catch (Exception e) {

            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        User user = new User();
        user.setName (req.getParameter("name")) ;
        user.setLastName (req.getParameter("lastName")) ;

       // user.setBirthdate (req.getParameter("birthdate")) ;

        user.setDocumentationType (req.getParameter("documentationType")) ;
       // user.setIdentification (req.getParameter("identification")) ;
      //  user.setTelephone (req.getParameter("telephone")) ;
        user.setGender (req.getParameter("gender")) ;
        user.setCountry (req.getParameter("country")) ;
        user.setState (req.getParameter("state")) ;
        user.setCity (req.getParameter("city")) ;

        user.setUserName (req.getParameter ("user")) ;
        user.setPassword (req.getParameter ("password")) ;
        user.setEmail (req.getParameter("email")) ;

        try {

            this.securityService.register (user);

            HttpSession session = req.getSession ();
            session.setAttribute ("user", user);

            resp.sendRedirect ("bienvenido.jsp") ;

        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect ("error.jsp");
        }
    }
}
