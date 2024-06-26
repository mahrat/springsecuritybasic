package com.secureApp.springsecuritybasic.repository;

import com.secureApp.springsecuritybasic.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByEmail(String username);

}
