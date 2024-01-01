package com.DbJpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DbJpa.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
