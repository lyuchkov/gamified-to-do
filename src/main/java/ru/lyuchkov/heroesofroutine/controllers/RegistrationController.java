package ru.lyuchkov.heroesofroutine.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.lyuchkov.heroesofroutine.entities.User;
import ru.lyuchkov.heroesofroutine.repositories.UserRepository;

import java.util.List;

@RestController
public class RegistrationController {

    final UserRepository repository;

    public RegistrationController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/getall")
    public List<User> startPage() {
        return repository.findAll();
    }

    @GetMapping("/save")
    public Object saveUser(@RequestParam(value = "name") String name,
                           @RequestParam(value = "email") String email,
                           @RequestParam(value = "password") String password
    ) {
        if (repository.findByNameOrEmail(name, email).isEmpty()) {
            return repository.save(new User(name, email, password));
        }
        return "Username or email is busy.";
    }

}
