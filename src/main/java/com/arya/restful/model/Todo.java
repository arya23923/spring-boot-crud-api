package com.arya.restful.model;
 
import jakarta.persistence.*;
import java.time.LocalDateTime;
 
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime createdAt;
    
    // Getters and Setters
}