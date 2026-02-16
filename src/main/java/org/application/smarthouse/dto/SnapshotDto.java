package org.application.smarthouse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SnapshotDto {

    private Long id;

    private String stateData;

    private LocalDateTime timestamp;

    private Long deviceId;

    private Long sceneId;
}