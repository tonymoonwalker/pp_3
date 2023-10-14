package com.tmw.pp_3.service;

import com.tmw.pp_3.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    void saveUser(User user);
    void deleteUser(Long id);
    List<User> allUsers();

}
