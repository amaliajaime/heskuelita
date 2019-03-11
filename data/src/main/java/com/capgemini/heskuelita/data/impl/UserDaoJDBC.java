package com.capgemini.heskuelita.data.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

import com.capgemini.heskuelita.core.beans.User;
import com.capgemini.heskuelita.data.DataException;
import com.capgemini.heskuelita.data.IUserDao;


public class UserDaoJDBC implements IUserDao {


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
        public User register(String name, String lastName, LocalDate birthdate, String documentationType, Integer identification,
                Integer telephone, String gender, String country, String state, String city,
                String userName, String password, String email, LocalDate created, LocalDate updated) {
            User us = null;
            try {

                Statement stm = this.conn.createStatement();

                stm.executeUpdate("INSERT INTO student (name, lastName, birthdate, documentationType, identification,telephone, gender, country, state, city, userName, password, email");
                stm.executeUpdate("INSERT INTO users (userName, password, email)");

                us = new User();

                us.setName (name) ;
                us.setLastName (lastName) ;
                us.setBirthdate (birthdate) ;
                us.setDocumentationType (documentationType) ;
                us.setIdentification (identification) ;
                us.setTelephone (telephone) ;
                us.setGender (gender) ;
                us.setCountry (country) ;
                us.setState (state) ;
                us.setCity (city) ;
                us.setCreated(created) ;
                us.setUpdated(updated) ;

                us.setUserName (userName) ;
                us.setPassword (password) ;
                us.setEmail (email) ;



            } catch (Exception e) {

                throw new DataException(e);
            }
            return us;
        }


}