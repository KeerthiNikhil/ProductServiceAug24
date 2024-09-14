package com.example.ProductServiceAug24.simple_table;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="st_learners")
public class Learner extends User {
    private String college;
    private String company;

}
