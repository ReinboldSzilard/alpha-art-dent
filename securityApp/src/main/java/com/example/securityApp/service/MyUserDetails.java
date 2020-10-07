package com.example.securityApp.service;

import com.example.securityApp.model.Role;
import com.example.securityApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;


public interface MyUserDetails {


    public void saveUser(User user);

    public boolean isUserAlreadyPresent(User user);

}
