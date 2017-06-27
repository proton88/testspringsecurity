package com.suhlob.testspringsecurity.service;

/**
 * Created by Andrei_Suhlob on 5/23/2017.
 */
public interface SecurityService {
    String findLoggedInUsername();
    void autoLogin(String username, String password);
}
