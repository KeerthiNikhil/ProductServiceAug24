package com.example.ProductServiceAug24.cardinalities.manytoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name="l_3")
public class Learner {
    @Id
    long id;
    String name;
    @ManyToOne
    Batch b;
}
