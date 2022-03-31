package com.kata311.springboot.kata_3_1_1.dao;


import com.kata311.springboot.kata_3_1_1.model.User;

import java.util.List;

public interface UserDao {
   void removeUserById(long id);
   User getUserById(long id);
   User updateUser(User user);
   void add(User user);
   List<User> listUsers();
}
