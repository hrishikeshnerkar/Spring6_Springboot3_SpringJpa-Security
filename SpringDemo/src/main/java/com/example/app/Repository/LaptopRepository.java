package com.example.app.Repository;

import com.example.app.model.Laptop;
import org.springframework.stereotype.Repository;

// Repository is used to connect the DB using jdbc
@Repository
public class LaptopRepository {
public void save(Laptop lap){
    System.out.println("Save in DB");
}
}
