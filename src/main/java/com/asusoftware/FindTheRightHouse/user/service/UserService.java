package com.asusoftware.FindTheRightHouse.user.service;

import com.asusoftware.FindTheRightHouse.exception.UserNotFoundException;
import com.asusoftware.FindTheRightHouse.user.model.User;
import com.asusoftware.FindTheRightHouse.user.model.dto.CreateUserDto;
import com.asusoftware.FindTheRightHouse.user.model.dto.UserDto;
import com.asusoftware.FindTheRightHouse.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void create(CreateUserDto createUserDto) {
        userRepository.save(CreateUserDto.toEntity(createUserDto));
    }

    public List<UserDto> findAll() {
        return userRepository.findAll().stream().map(UserDto::toDto).collect(Collectors.toList());
    }

    public User findUserById(UUID id) {
        return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }
}
