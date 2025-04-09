package com.todo.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    private boolean completed;

    private LocalDateTime createdAt = LocalDateTime.now();
}
