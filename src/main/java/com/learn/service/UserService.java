package com.learn.service;

import com.learn.entities.User;
import org.springframework.stereotype.Service;

/**
 * Created by farhans on 6/15/18.
 */
@Service
public interface UserService {
    User findUserByEmail(String email);
    void saveUser(User user);
}
