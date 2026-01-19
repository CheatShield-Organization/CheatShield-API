package org.cs.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cs.enums.UserRoles;

@Setter
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "emailAddress", nullable = false, unique = true)
    private String emailAddress;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "role")
    private UserRoles role;

}
