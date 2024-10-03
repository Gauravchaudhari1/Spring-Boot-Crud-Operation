package com.crudOperation.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudOperation.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    List<User> getUserById(Long id);
}
