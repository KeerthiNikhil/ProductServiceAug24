package com.example.ProductServiceAug24.mapped_super_class;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.management.MXBean;

//@Setter
//@Getter
@Data
@MappedSuperclass
public class User {
    @Id
    private int user_id;
    private String name;
    private String email;
    private String password;

}
