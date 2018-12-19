package com.angularSpring.crud.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.Id;
import java.util.Date;


@NoArgsConstructor
@Data
public class User {

    @Id
    private String id;
    private String nickName;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private Date ts;

    public User(String nickName, String firstName, String lastName, int age, String email, Date ts) {
        this.nickName = nickName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.ts = ts;
    }
}
