package org.application.smarthouse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommandDto {

    private Long id;

    private String commandType;

    private String value;

    private LocalDateTime createdAt;

    private Long deviceId;

    private Long sceneId;
}