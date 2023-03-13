package com.yeBaburavKaStyleHain.jpademoS1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserService {

    @Autowired
    UserRepository userRepository;
    public String addUser(User user){
       userRepository.save(user);
//       userRepository.findAll();
        return "user added";
    }
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    public User getUser(int id){
        return userRepository.findById(id).get();
    }

//    public String deleteUser(int id){
//        userRepository.deleteById(id);
//        return "user deleted";
//    }
}
