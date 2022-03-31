package com.kata311.springboot.kata_3_1_1.service;


import com.kata311.springboot.kata_3_1_1.dao.UserDao;
import com.kata311.springboot.kata_3_1_1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class UserServiceImp implements UserService {

   private final UserDao userDao;

   @Autowired
   public UserServiceImp(UserDao userDao) {
      this.userDao = userDao;
   }

   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Override
   public User updateUser(User user) {
      return userDao.updateUser(user);
   }

   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

   @Override
   public void removeUserById(int id) {
      userDao.removeUserById(id);
   }

   @Override
   public User getUserById(int id) {
      /*User user = null;
      Optional<User> optionalUser = userDao.getUserById(id);
      if (optionalUser.isPresent()) {
         user = optionalUser.get();
      }*/
      User user = userDao.getUserById(id);
      return user;
   }

}
