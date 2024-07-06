package ru.ablets.task3_1_2.service;


import ru.ablets.task3_1_2.models.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();


    User getUserById(long id);

    void updateUser(User user);

    void deleteUser(User user);

    void addUser(User user);
}
