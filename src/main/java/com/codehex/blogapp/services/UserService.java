package com.codehex.blogapp.services;

import com.codehex.blogapp.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
