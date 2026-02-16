package org.application.smarthouse.mapper;

import org.application.smarthouse.dto.DeviceDto;
import org.application.smarthouse.model.Device;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DeviceMapper {

    @Mapping(source = "room.id", target = "roomId")
    @Mapping(source = "room.name", target = "roomName")
    DeviceDto toDto(Device device);

    @Mapping(source = "roomId", target = "room.id")
    Device toEntity(DeviceDto deviceDto);
}