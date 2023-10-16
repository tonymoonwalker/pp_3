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
    @Pattern(regexp = "^[a-zA-Zа-яА-Я ]+$", message = "Не должно содержать цифр и спецсимволов")
    private String firstname;

    @Column(name = "lastname")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я ]+$", message = "Не должно содержать цифр и спецсимволов")
    private String lastname;

    @Column(name = "email")
    @Email(message = "Неверный формат электропочты")
    private String email;

    public void setId(Long id) {
        this.id = id;
    }
}
