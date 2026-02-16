package org.application.smarthouse.mapper;

import org.application.smarthouse.dto.RoomDto;
import org.application.smarthouse.model.Room;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoomMapper {

    @Mapping(source = "floor.id", target = "floorId")
    @Mapping(target = "deviceCount", expression = "java(room.getDevices() != null ? room.getDevices().size() : 0)")
    RoomDto toDto(Room room);

    @Mapping(source = "floorId", target = "floor.id")
    @Mapping(target = "devices", ignore = true)
    Room toEntity(RoomDto roomDto);
}