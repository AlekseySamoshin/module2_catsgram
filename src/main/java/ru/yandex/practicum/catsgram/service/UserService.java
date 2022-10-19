package ru.yandex.practicum.catsgram.service;

import org.springframework.stereotype.Service;
import ru.yandex.practicum.catsgram.exceptions.InvalidEmailException;
import ru.yandex.practicum.catsgram.exceptions.UserAlreadyExistException;
import ru.yandex.practicum.catsgram.model.User;

import java.util.HashMap;

@Service
public class UserService {
    private final HashMap<String, User> users = new HashMap<>();

    public HashMap<String, User> findAll() {
        return users;
    }

    public User createUser(User user) throws UserAlreadyExistException, InvalidEmailException {
        if (user.getEmail() == null) {
            throw new InvalidEmailException("Не указан email");
        } else if (users.containsKey(user.getEmail())) {
            throw new UserAlreadyExistException("Указанные email уже занят");
        } else {
            users.put(user.getEmail(), user);
        }
        return user;
    }

    public User updateUser(User user) throws InvalidEmailException {
        if (user.getEmail() == null) {
            throw new InvalidEmailException("Не указан email");
        } else {
            users.put(user.getEmail(), user);
        }
        return user;
    }
}
