package org.application.smarthouse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String avatarUrl;

    private Long userId;

    private String email;
}