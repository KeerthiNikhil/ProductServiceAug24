package com.example.ProductServiceAug24.simple_table;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="st_tas")
public class TA extends User {
    private int numOfQuestions;
    private String college;
}
