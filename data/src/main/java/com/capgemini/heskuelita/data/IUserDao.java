package com.capgemini.heskuelita.data;

import com.capgemini.heskuelita.core.beans.User;

import java.time.LocalDate;


public interface IUserDao {

    User login (String userName, String password);

    User register (String name, String lastName, LocalDate birthdate, String documentationType, Integer identification, Integer telephone,
                            String gender, String country, String state, String city, String userName, String password, String email,
                   LocalDate created, LocalDate updated) ;

}