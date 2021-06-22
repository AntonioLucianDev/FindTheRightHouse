package com.asusoftware.FindTheRightHouse.post;

import com.asusoftware.FindTheRightHouse.post.model.dto.CreatePostDto;
import com.asusoftware.FindTheRightHouse.post.model.dto.PostDto;
import com.asusoftware.FindTheRightHouse.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/posts")
public class PostController {

    private final PostService postService;

    @PostMapping(path = "/{id}")
    public void create(@PathVariable(name = "id") UUID id, @Valid @RequestBody CreatePostDto createPostDto) {
        postService.create(id, createPostDto);
    }


    @GetMapping(path = "/all")
    public List<PostDto> findAll() {
        return postService.findAll();
    }
}
