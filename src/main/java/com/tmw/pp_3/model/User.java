package com.tmw.pp_3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    @Pattern(regexp = "^[a-zA-Z]+$") private String firstname;

    @Column(name = "lastname")
    @Pattern(regexp = "^[a-zA-Z]+$") private String lastname;

    @Column(name = "email")
    @Email
    private String email;

    public void setId(Long id) {
        this.id = id;
    }
}
