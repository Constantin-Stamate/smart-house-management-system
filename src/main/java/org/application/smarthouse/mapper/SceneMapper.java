package org.application.smarthouse.mapper;

import org.application.smarthouse.dto.SceneDto;
import org.application.smarthouse.model.Device;
import org.application.smarthouse.model.Scene;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface SceneMapper {

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "devices", target = "deviceIds", qualifiedByName = "mapDevicesToIds")
    @Mapping(target = "commandCount", expression = "java(scene.getCommands() != null ? scene.getCommands().size() : 0)")
    SceneDto toDto(Scene scene);

    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "deviceIds", target = "devices", qualifiedByName = "mapIdsToDevices")
    Scene toEntity(SceneDto sceneDto);

    @Named("mapDevicesToIds")
    default List<Long> mapDevicesToIds(List<Device> devices) {
        if (devices == null) return null;
        return devices.stream()
                .map(Device::getId)
                .collect(Collectors.toList());
    }

    @Named("mapIdsToDevices")
    default List<Device> mapIdsToDevices(List<Long> deviceIds) {
        if (deviceIds == null) return null;
        return deviceIds.stream()
                .map(id -> {
                    Device device = new Device();
                    device.setId(id);
                    return device;
                })
                .collect(Collectors.toList());
    }
}