package com.example.securityApp.DB;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends CrudRepository<Users, Long> {


    @Query("Select u FROM users u WHERE u.email = :email")
    public Users getUsersByEmail(@Param("email") String email);



}
