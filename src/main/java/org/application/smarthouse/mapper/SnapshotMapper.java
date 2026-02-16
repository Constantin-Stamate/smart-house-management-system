package org.application.smarthouse.mapper;

import org.application.smarthouse.dto.SnapshotDto;
import org.application.smarthouse.model.Snapshot;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SnapshotMapper {

    @Mapping(source = "device.id", target = "deviceId")
    @Mapping(source = "scene.id", target = "sceneId")
    SnapshotDto toDto(Snapshot snapshot);

    @Mapping(source = "deviceId", target = "device.id")
    @Mapping(source = "sceneId", target = "scene.id")
    Snapshot toEntity(SnapshotDto snapshotDto);
}