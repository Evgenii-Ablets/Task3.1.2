package ru.ablets.task3_1_2.dao;


import ru.ablets.task3_1_2.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();


    User getUserById(long id);

    void updateUser(User user);

    void deleteUser(User user);

    void addUser(User user);
}
