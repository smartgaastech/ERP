package com.s2nsystems.erp.home.dao;

import java.util.List;

import com.s2nsystems.erp.home.entity.User;

public interface IUserDAO {
    
    List<User> getAllUsers();
	User getUserById(int userId);
    boolean addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
    boolean userExists(String title, String category);
}
