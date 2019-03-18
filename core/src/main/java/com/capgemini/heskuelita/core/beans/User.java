package com.capgemini.heskuelita.core.beans;

import lombok.*;

@Data
@NoArgsConstructor
public class User {

    private String userName ;
    private String password ;
    private String email ;
    
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userN) {
        this.userName = userN;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
