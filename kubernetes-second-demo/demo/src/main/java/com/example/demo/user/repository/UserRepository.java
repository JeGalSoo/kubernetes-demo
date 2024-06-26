package com.example.demo.user.repository;

import com.example.demo.user.model.User;
import com.example.demo.user.model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    UserDto findUsersByJob(String job);
}
