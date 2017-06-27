package com.suhlob.testspringsecurity.service;

import com.suhlob.testspringsecurity.dao.RoleDAO;
import com.suhlob.testspringsecurity.dao.UserDAO;
import com.suhlob.testspringsecurity.model.Role;
import com.suhlob.testspringsecurity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Andrei_Suhlob on 5/19/2017.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Autowired
    private RoleDAO roleDAO;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDAO.getOne(1L));
        user.setRoles(roles);


    }

    @Override
    public User findByUsername(String username) {
        return userDAO.findByUsername(username);
    }
}
