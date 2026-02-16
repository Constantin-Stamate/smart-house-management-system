package org.application.smarthouse.mapper;

import org.application.smarthouse.dto.FloorDto;
import org.application.smarthouse.model.Floor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FloorMapper {

    @Mapping(source = "home.id", target = "homeId")
    FloorDto toDto(Floor floor);

    @Mapping(source = "homeId", target = "home.id")
    Floor toEntity(FloorDto floorDto);
}