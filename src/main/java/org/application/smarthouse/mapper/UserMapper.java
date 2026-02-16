package org.application.smarthouse.mapper;

import org.application.smarthouse.dto.UserDto;
import org.application.smarthouse.model.Role;
import org.application.smarthouse.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.Set;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "profile.id", target = "profileId")
    @Mapping(source = "roles", target = "roles", qualifiedByName = "mapRolesToStrings")
    UserDto toDto(User user);

    @Mapping(source = "profileId", target = "profile.id")
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "roles", ignore = true)
    User toEntity(UserDto userDto);

    @Named("mapRolesToStrings")
    default Set<String> mapRolesToStrings(Set<Role> roles) {
        if (roles == null) return null;
        return roles.stream()
                .map(Role::getName)
                .collect(Collectors.toSet());
    }
}