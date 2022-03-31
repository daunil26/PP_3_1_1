package com.kata311.springboot.kata_3_1_1.service;

import com.kata311.springboot.kata_3_1_1.model.User;
import java.util.List;

public interface UserService {
    void add(User user);
    User updateUser(User user);
    void removeUserById(int id);
    User getUserById(int id);
    List<User> listUsers();
}
