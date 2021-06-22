package com.asusoftware.FindTheRightHouse.post.model.dto;

import com.asusoftware.FindTheRightHouse.post.model.Post;
import com.asusoftware.FindTheRightHouse.post.model.PostState;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class PostDto {

    @Id private UUID id;
    @NotBlank
    private String description;
    @NotNull
    private PostState postState;
    @NotNull private Long price;
    @NotNull private LocalDateTime createdAt;
    @NotNull private ApartmentDto apartmentDto;

    public static PostDto toDto(Post post) {
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setDescription(post.getDescription());
        postDto.setPostState(post.getPostState());
        postDto.setPrice(post.getPrice());
        postDto.setCreatedAt(post.getCreatedAt());
        postDto.setApartmentDto(ApartmentDto.toDto(post.getApartment()));
        return postDto;
    }
}
