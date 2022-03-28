package com.kata311.springboot.kata_3_1_1.service;


import com.kata311.springboot.kata_3_1_1.dao.UserRepository;
import com.kata311.springboot.kata_3_1_1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

   private final UserRepository userRepository;

   @Autowired
   public UserServiceImp(UserRepository userRepository) {
      this.userRepository = userRepository;
   }

   @Override
   public void add(User user) {
      userRepository.save(user);
   }

   @Override
   public List<User> listUsers() {
      return userRepository.findAll();
   }

   @Override
   public void removeUserById(int id) {
      userRepository.deleteById(id);
   }

   @Override
   public User getUserById(int id) {
      User user = null;
      Optional<User> optionalUser = userRepository.findById(id);
      if (optionalUser.isPresent()) {
         user = optionalUser.get();
      }
      return user;
   }

}
