package org.application.smarthouse.mapper;

import org.application.smarthouse.dto.ProfileDto;
import org.application.smarthouse.model.Profile;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "user.email", target = "email")
    ProfileDto toDto(Profile profile);

    @Mapping(source = "userId", target = "user.id")
    Profile toEntity(ProfileDto profileDto);
}