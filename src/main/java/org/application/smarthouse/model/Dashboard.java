package org.application.smarthouse.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "dashboards")
public class Dashboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer totalDevices;

    private Integer activeDevices;

    private Double energyUsage;

    private Double temperature;

    private Double humidity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "home_id", nullable = false, unique = true)
    private Home home;
}