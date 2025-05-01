package com.angler.user_service.service;

import com.angler.user_service.dto.UserDto;
import com.angler.user_service.entity.User;
import com.angler.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        System.out.println("NICEEEEEEE");
        return userRepository.save(user);

    }

}