package com.asusoftware.FindTheRightHouse.user;

import com.asusoftware.FindTheRightHouse.user.model.dto.CreateUserDto;
import com.asusoftware.FindTheRightHouse.user.model.dto.UserDto;
import com.asusoftware.FindTheRightHouse.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping(path = "/create")
    public void create(@Valid @RequestBody CreateUserDto createUserDto) {
        userService.create(createUserDto);
    }

    @GetMapping(path = "/all")
    private List<UserDto> findAll() {
        return userService.findAll();
    }
}
