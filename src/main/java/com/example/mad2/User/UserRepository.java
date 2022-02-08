package com.example.mad2.User;

import config.DBManager;

import java.sql.*;

public class UserRepository implements UserRepositoryInterface {

    private static Connection connection = DBManager.getConnection();

    @Override
    public void createUser(User user) {
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO users(user_email,user_username,user_password) VALUE (?,?,?);", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getPassword());

            ps.executeUpdate();
        } catch (SQLException err) {
            System.out.println(err);
        }

    }

    @Override
    public User readUser(User user) {
        return new User();
    }
}
