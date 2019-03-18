package com.capgemini.heskuelita.data.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;

import com.capgemini.heskuelita.core.beans.Student;
import com.capgemini.heskuelita.core.beans.User;
import com.capgemini.heskuelita.data.DataException;
import com.capgemini.heskuelita.data.IUserDao;


public class UserDaoJDBC implements IUserDao {
    private Logger logger= Logger.getLogger(UserDaoJDBC.class);

    private Connection conn;

    public UserDaoJDBC (Connection conn) {

        super ();

        this.conn = conn;
    }

    @Override
    public User login(String userName, String password) {

        User us = null;
        try {

            Statement stm = this.conn.createStatement ();

            ResultSet resultSet = stm.executeQuery ("SELECT * from users WHERE us_username= userName AND us_pw=password");

            while (resultSet.next ()) {

                us = new User ();
                us.setEmail (resultSet.getString ("us_email"));
                us.setUserName (userName);
                break;
            }

        } catch (Exception e) {

            throw new DataException (e);
        }

        if (us == null) {
            throw new DataException ("Usuario " + userName + " desconocido");
        }

        return us;
    }

    @Override
        public void register(Student student) {
        int r = 0;
        int p = 0;

        try{

            PreparedStatement pstmStudent = this.conn.prepareStatement("INSERT INTO student VALUES (?, ?, ?, ?, ?, ?, ?, default, ?, ?, ?)");

            pstmStudent.setString(1, student.getName());
            pstmStudent.setString(2, student.getLastName());
            pstmStudent.setObject(3, student.getBirthdate());
            pstmStudent.setString(4, student.getDocumentationType());
            pstmStudent.setInt(5, student.getIdentification());
            pstmStudent.setInt(6, student.getTelephone());
            pstmStudent.setString(7, student.getGender());

            pstmStudent.setString(8, student.getUser().getUserName()) ;
            pstmStudent.setString(9, student.getUser().getEmail());
            pstmStudent.setString(10, student.getUser().getPassword());


            PreparedStatement pstmUser = this.conn.prepareStatement("INSERT INTO users VALUES (?, ?, ?)");
            pstmUser.setString(1, student.getUserName()) ;
            pstmUser.setString(2, student.getEmail());
            pstmUser.setString(3, student.getPassword());

            logger.info("Nombre de usuario: " + student.getUserName());
            logger.info("Email de usuario: " + student.getEmail());
            logger.info("Psw de usuario:" + student.getPassword());

            r = pstmUser.executeUpdate();

            System.out.println("Se registro el usuario: " + r);

            p = pstmStudent.executeUpdate();
            System.out.println("Se registro el estudiante: " + p);


        }  catch(Exception e){
            throw new DataException (e);
        }

    }


}