package org.application.smarthouse.mapper;

import org.application.smarthouse.dto.DashboardDto;
import org.application.smarthouse.model.Dashboard;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DashboardMapper {

    @Mapping(source = "home.id", target = "homeId")
    DashboardDto toDto(Dashboard dashboard);

    @Mapping(source = "homeId", target = "home.id")
    Dashboard actionToEntity(DashboardDto dashboardDto);
}