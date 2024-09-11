package com.example.ProductServiceAug24.joined_table;

import com.example.ProductServiceAug24.mapped_super_class.User;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name="jt_tas")
@PrimaryKeyJoinColumn(name="user_id")
public class TA extends User {
    private int numOfQuestions;
    private String college;
}
