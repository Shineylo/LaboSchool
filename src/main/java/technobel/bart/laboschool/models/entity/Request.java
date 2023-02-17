package technobel.bart.laboschool.models.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Setter @Getter
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id", nullable = false)
    private Long id;

    @Column(name = "time_slot",nullable = false)
    private LocalDateTime timeSlot;

    @Column(nullable = false)
    private LocalTime duration;

    private String reason;

    private String refuse;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

}
