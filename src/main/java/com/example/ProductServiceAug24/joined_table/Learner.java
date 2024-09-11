package com.example.ProductServiceAug24.joined_table;

import com.example.ProductServiceAug24.mapped_super_class.User;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.PrimaryKeyJoinColumns;
import lombok.Data;

@Data
@Entity(name="jt_learners")
@PrimaryKeyJoinColumn(name="user_id")
public class Learner extends User {
    private String college;
    private String company;

}
