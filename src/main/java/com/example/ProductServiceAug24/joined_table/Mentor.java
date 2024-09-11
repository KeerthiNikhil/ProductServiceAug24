package com.example.ProductServiceAug24.joined_table;

import com.example.ProductServiceAug24.mapped_super_class.User;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name="jt_mentors")
@PrimaryKeyJoinColumn(name= "user_id")
public class Mentor extends User {
    private double rating;
    private String currentCompany;

}
