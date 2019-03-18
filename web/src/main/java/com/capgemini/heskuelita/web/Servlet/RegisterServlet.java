package com.capgemini.heskuelita.web.Servlet;

import com.capgemini.heskuelita.core.beans.Student;
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
import org.apache.log4j.Logger;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@WebServlet ("/register")
public class RegisterServlet extends HttpServlet {

    private Logger logger= Logger.getLogger(RegisterServlet.class);

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

        /** Creamos un estudiante **/
        Student student= new Student();
        student.setName(req.getParameter("ctrlName"));
        student.setLastName(req.getParameter("ctrlLastName"));

        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd");
        student.setBirthdate(LocalDate.parse(req.getParameter("ctrlBirthdate"),formatter));

        student.setDocumentationType(req.getParameter("ctrlDocType"));

        student.setIdentification(Integer.parseInt(req.getParameter("ctrlIdentif")));
        student.setTelephone(Integer.parseInt(req.getParameter("ctrlTelephone")));
        student.setGender(req.getParameter("ctrlGender"));
        student.setUserName(req.getParameter("ctrlUserName"));
        student.setEmail(req.getParameter("ctrlEmail"));
        student.setPassword(req.getParameter("ctrlPsw"));


        /** Creamos un usuario **/
        User user1= new User();
        user1.setUserName(req.getParameter("ctrlUserName"));
        user1.setEmail(req.getParameter("ctrlEmail"));
        user1.setPassword(req.getParameter("ctrlPsw"));

        student.setUser(user1);

        logger.debug("Inicio del proceso de sign up...");
        logger.info("Datos del usuario a registrar");

        logger.info("Nombre de usuario: " + user1.getUserName());
        logger.info("Nombre de usuario del Estudiante :" + student.getUserName());
        logger.info("Email de usuario: " + user1.getEmail());
        logger.info("Psw de usuario:" + user1.getPassword());

        try {

            this.securityService.register (student);

            HttpSession session = req.getSession ();
            session.setAttribute ("user", student);

            logger.debug("Servicio de registro de estudiante finalizado con exito!!!");
            resp.sendRedirect ("home.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Error en proceso de sign up!!!");
        }
    }


}
