package ru.yandex.practicum.catsgram.controller;

import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.catsgram.exceptions.InvalidEmailException;
import ru.yandex.practicum.catsgram.exceptions.UserAlreadyExistException;
import ru.yandex.practicum.catsgram.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final HashMap<String, User> users = new HashMap<>();

    @GetMapping
    public HashMap<String, User> findAll() {
        return users;
    }

    @PostMapping
    public User create(@RequestBody User user) throws UserAlreadyExistException, InvalidEmailException {
        if (user.getEmail() == null) {
            throw new InvalidEmailException("Не указан email");
        } else if (users.containsKey(user.getEmail())) {
            throw new UserAlreadyExistException("Указанные email уже занят");
        } else {
            users.put(user.getEmail(), user);
        }
        return user;
    }

    @PutMapping
    public User update(@RequestBody User user) throws InvalidEmailException {
        if (user.getEmail() == null) {
            throw new InvalidEmailException("Не указан email");
        } else {
            users.put(user.getEmail(), user);
        }
        return user;
    }
}
