package com.capgemini.heskuelita.core.beans;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Student {

    private String name ;
    private String lastName ;
    private LocalDate birthdate ;
    private String documentationType ;
    private Integer identification ;
    private Integer telephone ;
    private String gender ;
    private String userName ;
    private String password ;
    private String email ;
    private User user ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getDocumentationType() {
        return documentationType;
    }

    public void setDocumentationType(String documentationType) {
        this.documentationType = documentationType;
    }

    public Integer getIdentification() {
        return identification;
    }

    public void setIdentification(Integer identification) {
        this.identification = identification;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public void setUser (User user) { this.user = user;} ;

    public User getUser() { return this.user;} ;

}

