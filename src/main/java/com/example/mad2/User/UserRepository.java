package com.example.mad2.User;

import config.DBManager;

import java.sql.*;

public class UserRepository implements UserRepositoryInterface {

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

    @Override
    public User readUser(String email, String password) {

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM users WHERE user_email = ? AND user_password = ?;");
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                User user = new User();
                user.setId(rs.getInt(1));
                user.setEmail(rs.getString(2));
                user.setUsername(rs.getString(3));
                user.setPassword(rs.getString(4));
                return user;
            }
        } catch (SQLException err) {
            err.printStackTrace();
        }
        return null;
    }


}
