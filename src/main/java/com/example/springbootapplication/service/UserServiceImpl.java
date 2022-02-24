package com.example.springbootapplication.service;

import com.example.springbootapplication.dao.UserDao;
import com.example.springbootapplication.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("userService")
@Transactional
public class UserServiceImpl  implements UserService{

    @Autowired
    private UserDao userDao;

    public User findByName(String name) {
        return (User) userDao.findByName(name);
    }

    public void saveUser(User user) {
        userDao.save(user);
    }

    public Optional<User> findById(long id) {
        return userDao.findById(id);
    }

    public boolean isUserExist(User user) {
        return findByName(user.getName()) != null;
    }

    public List<User> findAllUsers(){
        return userDao.findAll();
    }

    public void deleteUserById(Long id){
        userDao.deleteById(id);
    }

    public void deleteAllUsers(){
        userDao.deleteAll();
    }

    public void updateUser(User user){
        saveUser(user);
    }

}
