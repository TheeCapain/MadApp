package com.example.mad2.User;

import config.DBManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

public class UserRepository {

    private static Connection connection = DBManager.getConnection();

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


}
