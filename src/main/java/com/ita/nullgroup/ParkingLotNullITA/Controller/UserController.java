package com.ita.nullgroup.ParkingLotNullITA.Controller;

import com.ita.nullgroup.ParkingLotNullITA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public String getUsers(){
        return userService.getUserById(1).getUsername();
    }
}
