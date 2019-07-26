package com.ita.nullgroup.ParkingLotNullITA.service.impl;

import com.ita.nullgroup.ParkingLotNullITA.model.User;
import com.ita.nullgroup.ParkingLotNullITA.repository.UserRepository;
import com.ita.nullgroup.ParkingLotNullITA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User getUserById(int id) {
        userRepository.save(new User("username","password"));
        return userRepository.findById(id).get();
    }
}
