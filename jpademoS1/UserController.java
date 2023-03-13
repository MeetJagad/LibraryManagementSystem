package com.yeBaburavKaStyleHain.jpademoS1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/get_users")
    public List<User> getUser(){
        return userService.getUsers();
    }

    @GetMapping("/get_user")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }
// HM -> Delete by roll no
    // -> delete all the users
    // -> update a user by Id
//    @DeleteMapping("/delete_user")
//    public String deleteUser(@RequestParam("id") int id){
//        return userService.deleteUser(id);
//    }

}
