package com.springboot.springboot_springdatajpa.repository;

import com.springboot.springboot_springdatajpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long>{

    public List<User> findAll();

    public void deleteById();

}
