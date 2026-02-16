package org.application.smarthouse.mapper;

import org.application.smarthouse.dto.CommandDto;
import org.application.smarthouse.model.Command;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CommandMapper {

    @Mapping(source = "device.id", target = "deviceId")
    @Mapping(source = "scene.id", target = "sceneId")
    CommandDto toDto(Command command);

    @Mapping(source = "deviceId", target = "device.id")
    @Mapping(source = "sceneId", target = "scene.id")
    Command toEntity(CommandDto commandDTO);
}