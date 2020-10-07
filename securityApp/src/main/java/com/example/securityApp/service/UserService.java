package com.example.securityApp.service;

import com.example.securityApp.model.User;
import com.example.securityApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> listAll() {
        return repo.findAll();
    }

    public void save(User name) {
        repo.save(name);
    }

    public Optional<User> get(long id) {
        return repo.findById((int) id);
    }

    public void delete(long id) {
        repo.deleteById((int) id);
    }
}

