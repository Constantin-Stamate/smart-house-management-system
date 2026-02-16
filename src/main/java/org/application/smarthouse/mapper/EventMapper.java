package org.application.smarthouse.mapper;

import org.application.smarthouse.dto.EventDto;
import org.application.smarthouse.model.Event;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EventMapper {

    @Mapping(source = "device.id", target = "deviceId")
    @Mapping(source = "device.name", target = "deviceName")
    EventDto toDto(Event event);

    @Mapping(source = "deviceId", target = "device.id")
    Event toEntity(EventDto eventDto);
}