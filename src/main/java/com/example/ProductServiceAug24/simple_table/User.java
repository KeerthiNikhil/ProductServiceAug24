package com.example.ProductServiceAug24.simple_table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

//@Setter
//@Getter
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity(name="st_users")
public class User {
    @Id
    private int id;
    private String name;
    private String email;
    private String password;

}
