package com.tokenization.tokenization.service;

import com.tokenization.tokenization.model.User;
import com.tokenization.tokenization.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(String id){
        userRepository.deleteById(id);
    }
}
