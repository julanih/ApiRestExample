package com.julanih.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julanih.demo.entity.User;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {

}
