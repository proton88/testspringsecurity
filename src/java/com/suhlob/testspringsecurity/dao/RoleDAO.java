package com.suhlob.testspringsecurity.dao;

import com.suhlob.testspringsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Andrei_Suhlob on 5/19/2017.
 */
public interface RoleDAO extends JpaRepository<Role, Long> {
}
