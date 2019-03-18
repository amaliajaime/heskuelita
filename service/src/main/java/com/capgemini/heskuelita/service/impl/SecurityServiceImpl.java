package com.capgemini.heskuelita.service.impl;


import com.capgemini.heskuelita.core.beans.Student;
import com.capgemini.heskuelita.core.beans.User;
import com.capgemini.heskuelita.data.IUserDao;
import com.capgemini.heskuelita.service.ISecurityService;
import org.apache.log4j.Logger;

public class SecurityServiceImpl implements ISecurityService {
    private Logger logger= Logger.getLogger(SecurityServiceImpl.class);

    private IUserDao userDao;

    public SecurityServiceImpl (IUserDao userDao) {

        super ();

        this.userDao = userDao;
    }

    @Override
    public void login (User user) throws SecurityException {

        try {

            user = this.userDao.login (user.getUserName(), user.getPassword());
        } catch (Exception e) {

            throw new SecurityException(e);
        }
    }

    @Override
    public void register(Student s) throws SecurityException {

        try {

            logger.info("Nombre de usuario: " + s.getUserName());
            logger.info("Email de usuario: " + s.getEmail());
            logger.info("Psw de usuario:" + s.getPassword());

            this.userDao.register (s);
        } catch (Exception e) {

            throw new SecurityException(e);
        }
    } }
