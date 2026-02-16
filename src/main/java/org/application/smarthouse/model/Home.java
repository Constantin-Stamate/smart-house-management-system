package org.application.smarthouse.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "homes")
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private String owner;

    private String timezone;

    @OneToMany(mappedBy = "home", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Floor> floors;

    @OneToOne(mappedBy = "home", cascade = CascadeType.ALL)
    private Dashboard dashboard;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "current_mode_id")
    private Mode currentMode;

    @OneToMany(mappedBy = "home", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Mode> availableModes;
}