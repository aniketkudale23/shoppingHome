package com.example.shoppingHome.shoppingHome.controllers.user;

import com.example.shoppingHome.shoppingHome.dto.User;
import com.example.shoppingHome.shoppingHome.entities.user.Registeruser;
import com.example.shoppingHome.shoppingHome.requests.user.UserEmail;
import com.example.shoppingHome.shoppingHome.response.RegisterResponse;
import com.example.shoppingHome.shoppingHome.response.ResponseMessage;
import com.example.shoppingHome.shoppingHome.services.user.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserManager userManager;

    @PostMapping("/register")
    public RegisterResponse userRegistration(@RequestBody Registeruser user) {
        return userManager.saveUser(user);
    }

    @PostMapping("/emailExist")
    public RegisterResponse emailExist(@RequestBody UserEmail userEmail) {
        return userManager.emailExist(userEmail);

    }

    @PostMapping("/login")
    public ResponseMessage Login(@RequestParam String userName, @RequestParam String password) {
        return userManager.existByUserNamePassword(userName, password);
    }

    @PostMapping("/userExist")
    public ResponseMessage userName(@RequestParam  String userName)
    {
        return  userManager.ExistByUserName(userName);
    }

}