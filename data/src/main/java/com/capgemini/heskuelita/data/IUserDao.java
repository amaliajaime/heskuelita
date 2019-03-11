package com.capgemini.heskuelita.data;

import com.capgemini.heskuelita.core.beans.User;

import java.time.LocalDate;


public interface IUserDao {

    User login (String userName, String password);

    void register (User user) ;

}