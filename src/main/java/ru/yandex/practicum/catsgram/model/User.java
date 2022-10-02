package ru.yandex.practicum.catsgram.model;

import java.time.LocalDate;

public class User {
    private String email;
    private String nickname;
    private LocalDate birthdate;

    public String getEmail() {
        return email;
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return email.equals(user.getEmail()); //hashCode() == user.hashCode();
    }
}