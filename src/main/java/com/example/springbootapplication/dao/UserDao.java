package com.example.springbootapplication.dao;

import com.example.springbootapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao extends JpaRepository<User, Long> {

    User findByName(String name);


}

