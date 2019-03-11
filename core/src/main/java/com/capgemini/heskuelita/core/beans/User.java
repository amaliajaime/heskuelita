package com.capgemini.heskuelita.core.beans;


import java.time.LocalDate;
import lombok.*;


@Data
@NoArgsConstructor
public class User {

    private String name ;
    private String lastName ;
    private LocalDate birthdate ;
    private String documentationType ;
    private Integer identification ;
    private Integer telephone ;
    private String gender ;
    private String country ;
    private String state ;
    private String city ;

    private String userName ;
    private String password ;
    private String email ;

    private LocalDate created;

    private LocalDate updated;
}
