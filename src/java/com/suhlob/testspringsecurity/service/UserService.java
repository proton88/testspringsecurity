package com.suhlob.testspringsecurity.service;

import com.suhlob.testspringsecurity.model.User;

/**
 * Created by Andrei_Suhlob on 5/19/2017.
 */
public interface UserService {

    void saveUser(User user);

    User findByUsername(String username);
}
