package com.udemy.masterclass.repository;


import com.udemy.masterclass.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
