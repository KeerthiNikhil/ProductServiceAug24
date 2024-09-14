package com.example.ProductServiceAug24.simple_table;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="st_mentors")
public class Mentor extends User {
    private double rating;
    private String currentCompany;

}
