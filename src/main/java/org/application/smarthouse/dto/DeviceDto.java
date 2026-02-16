package org.application.smarthouse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceDto {

    private Long id;

    private String name;

    private String type;

    private String status;

    private Long roomId;

    private String roomName;
}