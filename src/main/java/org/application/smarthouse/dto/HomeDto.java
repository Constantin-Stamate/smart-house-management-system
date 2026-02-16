package org.application.smarthouse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomeDto {

    private Long id;

    private String name;

    private String address;

    private String owner;

    private String timezone;

    private Long currentModeId;

    private String currentModeName;
}