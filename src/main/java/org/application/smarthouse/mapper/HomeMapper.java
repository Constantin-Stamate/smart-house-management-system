package org.application.smarthouse.mapper;

import org.application.smarthouse.dto.HomeDto;
import org.application.smarthouse.model.Home;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface HomeMapper {

    @Mapping(source = "currentMode.id", target = "currentModeId")
    @Mapping(source = "currentMode.name", target = "currentModeName")
    HomeDto toDto(Home home);

    @Mapping(source = "currentModeId", target = "currentMode.id")
    Home toEntity(HomeDto homeDto);
}