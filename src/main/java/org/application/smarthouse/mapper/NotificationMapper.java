package org.application.smarthouse.mapper;

import org.application.smarthouse.dto.NotificationDto;
import org.application.smarthouse.model.Notification;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface NotificationMapper {

    @Mapping(source = "user.id", target = "userId")
    NotificationDto toDto(Notification notification);

    @Mapping(source = "userId", target = "user.id")
    Notification toEntity(NotificationDto notificationDto);
}