package com.kata311.springboot.kata_3_1_1.dao;


import com.kata311.springboot.kata_3_1_1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {


   private final EntityManager entityManager;

   @Autowired
   public UserDaoImp(EntityManager entityManager) {
      this.entityManager = entityManager;
   }

   @Override
   public void add(User user) {
      entityManager.persist(user);
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<User> listUsers() {
      return entityManager.createQuery("FROM User", User.class).getResultList();
   }

   @Override
   public void removeUserById(long id) {
      entityManager.remove(entityManager.find(User.class, id));
   }

   @Override
   public User getUserById(long id) {
      return entityManager.find(User.class, id);
   }

   @Override
   public User updateUser(User user) {
      return entityManager.merge(user);
   }
}
