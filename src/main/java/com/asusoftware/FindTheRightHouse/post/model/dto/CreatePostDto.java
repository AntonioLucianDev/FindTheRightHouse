package com.asusoftware.FindTheRightHouse.post.model.dto;

import com.asusoftware.FindTheRightHouse.post.model.Post;
import com.asusoftware.FindTheRightHouse.post.model.PostState;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Getter
@Setter
public class CreatePostDto {

    @NotBlank
    private String description;
    @NotNull
    private PostState postState;
    @NotNull private Long price;
    @NotNull private CreateApartmentDto apartmentDto;

    public static Post toEntity(CreatePostDto createPostDto) {
        Post post = new Post();
        post.setDescription(createPostDto.getDescription());
        post.setPrice(createPostDto.getPrice());
        post.setPostState(createPostDto.getPostState());
        post.setCreatedAt(LocalDateTime.now(ZoneOffset.UTC));
        System.out.println(createPostDto.getApartmentDto());
        post.setApartment(CreateApartmentDto.toEntity(createPostDto.getApartmentDto()));
        return post;
    }
}
