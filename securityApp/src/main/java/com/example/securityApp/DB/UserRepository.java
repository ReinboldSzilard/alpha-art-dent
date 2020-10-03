package com.example.securityApp.DB;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User,Integer> {

    @Query("SELECT u FROM  User u WHERE u.username = :username")
    public User getUserByUsername(@Param("username")String username);
}
