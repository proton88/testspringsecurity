package com.suhlob.testspringsecurity.model;

import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Andrei_Suhlob on 5/18/2017.
 */

@Entity
@Table(name="roles")
public class Role{
    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Role() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
