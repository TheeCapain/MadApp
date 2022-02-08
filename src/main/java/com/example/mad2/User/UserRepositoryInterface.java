package com.example.mad2.User;

public interface UserRepositoryInterface {

     void createUser(User user);

    void readUser(String email, String password);
}
