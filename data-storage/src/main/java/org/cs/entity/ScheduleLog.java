package org.cs.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
public class ScheduleLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "reserved_time")
    private LocalDateTime reservedTime;

    @Column(name = "reserved_place")
    private String reservedPlace;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private User teacher;

}
