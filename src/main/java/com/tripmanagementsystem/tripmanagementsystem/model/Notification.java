package com.tripmanagementsystem.tripmanagementsystem.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // The user receiving the notification

    private String message; // Notification message
    private boolean isRead; // Status of the notification
    private LocalDateTime createdDate; // Date of creation

    // Getters and setters are generated by Lombok
}