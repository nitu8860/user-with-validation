package com.example.user.with.validation.service;

import com.example.user.with.validation.model.User;
import org.json.JSONObject;

import java.util.List;

public interface IUserInterface {
    public void addUser(User user);
    List<User> getAllUsers();
    User set(JSONObject user);
    List<User> getUser(Integer id);
    List<String> deleteById(Integer id);
}