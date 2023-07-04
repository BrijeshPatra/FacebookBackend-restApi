package com.facebook.api.services;

import com.facebook.api.entity.Users;
import com.facebook.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.*;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public Users saveUserMetaData(Users users) {

        Date date=new Date();
        long time=date.getTime();
        Timestamp dateTime = new Timestamp(time);

        users.setUserID(UUID.randomUUID());
        users.setActivityStatus(true);
        users.setJoiningDate(dateTime);

        return userRepository.save(users);
    }
    public List<Users> getAllUsers() {
        return userRepository.findAll();

    }
    public Optional<Users> getUsersByID(UUID userID) {
        return userRepository.findById(userID);
    }
}
