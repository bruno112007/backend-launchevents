package com.bruno.launchevents.entities;

import com.bruno.launchevents.enums.LaunchStatus;
import com.bruno.launchevents.enums.LaunchType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user_tb")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Launch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private Integer year;
    @Column(nullable = false)
    private Integer month;
    @Column(nullable = false)
    private Double value;
    @Column(nullable = false)
    private LaunchType launchType;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private LaunchStatus launchStatus;
}
