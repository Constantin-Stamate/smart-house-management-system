package org.application.smarthouse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DashboardDto {

    private Long id;

    private Integer totalDevices;

    private Integer activeDevices;

    private Double energyUsage;

    private Double temperature;

    private Double humidity;

    private Long homeId;
}