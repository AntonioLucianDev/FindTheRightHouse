package com.asusoftware.FindTheRightHouse.post.service;

import com.asusoftware.FindTheRightHouse.post.PostRepository;
import com.asusoftware.FindTheRightHouse.post.model.Post;
import com.asusoftware.FindTheRightHouse.post.model.dto.CreatePostDto;
import com.asusoftware.FindTheRightHouse.post.model.dto.PostDto;
import com.asusoftware.FindTheRightHouse.user.model.User;
import com.asusoftware.FindTheRightHouse.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {

    private final UserService userService;
    private final PostRepository postRepository;

    public void create(UUID id, CreatePostDto createPostDto) {
        User user = userService.findUserById(id);
        System.out.println("sdf " + createPostDto.getApartmentDto());
        Post post = CreatePostDto.toEntity(createPostDto);
        post.setUser(user);
        postRepository.save(post);
    }

    public List<PostDto> findAll() {
        return postRepository.findAll().stream().map(PostDto::toDto).collect(Collectors.toList());
    }
}
