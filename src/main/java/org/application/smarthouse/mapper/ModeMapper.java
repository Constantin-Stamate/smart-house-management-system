package org.application.smarthouse.mapper;

import org.application.smarthouse.dto.ModeDto;
import org.application.smarthouse.model.Mode;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ModeMapper {

    @Mapping(source = "home.id", target = "homeId")
    ModeDto toDto(Mode mode);

    @Mapping(source = "homeId", target = "home.id")
    Mode toEntity(ModeDto modeDto);
}