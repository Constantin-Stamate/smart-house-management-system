package org.application.smarthouse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto {

    private Long id;

    private String name;

    private Long floorId;

    private Integer deviceCount;
}