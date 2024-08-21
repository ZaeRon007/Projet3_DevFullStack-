package com.chatop.model;

import jakarta.persistence.Id;
import java.sql.Timestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class DBUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;
    
    @Column(name = "password")
    private String password;

    @Column(name = "created_at")
    private Timestamp created_at;
    
    @Column(name = "updated_at")
    private Timestamp updated_at;

    public DBUser(){}

    public DBUser(  String name,
                    String email,
                    Timestamp created_at,
                    Timestamp updated_at
                    // String password
                    ){
        this.name = name;
        this.email = email;
        this.created_at = created_at;
        this.updated_at = updated_at; 
        // this.password = password;          
    }
}