package com.example.securityApp.service;

import com.example.securityApp.model.Role;
import com.example.securityApp.model.User;
import com.example.securityApp.repository.RoleRepository;
import com.example.securityApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class UserDetailsServiceImpl implements MyUserDetails {
    @Autowired
    BCryptPasswordEncoder encoder;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        user.setStatus("VERIFIED");
        Role userRole = roleRepository.findByRole("SITE_USER");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);
    }

    @Override
    public boolean isUserAlreadyPresent(User user) {
        // Try to implement this method, as assignment.
        return false;
    }

}
