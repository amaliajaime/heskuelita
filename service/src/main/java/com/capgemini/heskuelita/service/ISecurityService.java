package com.capgemini.heskuelita.service;


import com.capgemini.heskuelita.core.beans.Student;
import com.capgemini.heskuelita.core.beans.User;


public interface ISecurityService {


    void login (User user) throws SecurityException ;

    void register (Student student) throws SecurityException ;
}
