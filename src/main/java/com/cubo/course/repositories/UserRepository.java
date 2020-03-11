package com.cubo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cubo.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
