package com.asusoftware.FindTheRightHouse.user.model.dto;

import com.asusoftware.FindTheRightHouse.post.model.dto.PostDto;
import com.asusoftware.FindTheRightHouse.user.model.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
@Setter
public class UserDto {

    @Id private UUID id;
    @NotBlank
    private String firstName;
    @NotBlank private String lastName;
    @Email
    @NotBlank private String email;
    @NotBlank private String password;
    private List<PostDto> postDto;

    public static UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setPostDto(user.getPostList().stream().map(PostDto::toDto).collect(Collectors.toList()));
        return userDto;
    }
}
