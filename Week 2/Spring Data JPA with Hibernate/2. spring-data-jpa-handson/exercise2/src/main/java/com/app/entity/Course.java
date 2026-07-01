package com.app.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

    public Course() {}
    public Course(String title) { this.title = title; }

    public Long getId() { return id; }
    public String getTitle() { return title; }
}