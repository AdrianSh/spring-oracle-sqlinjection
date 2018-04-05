package hello.controllers;

import java.util.List;

import hello.repositories.UserRepository;
import hello.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserRestController {

    private UserRepository userRepository;

    @Autowired
    public UserRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value="", method=RequestMethod.GET)
    public List<User> getAllUsers() {
        return userRepository.getAll();
    }

    @RequestMapping(value="register", method=RequestMethod.GET)
    public String createUser() {
        return "formularioRegistro";
    }
}