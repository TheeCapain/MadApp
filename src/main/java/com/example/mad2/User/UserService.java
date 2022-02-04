package com.example.mad2.User;

public class UserService {

    public User createUser(User user, String pw) {
        validateMatchingPasswords(pw, user);
        return user;
    }

    public String validateMatchingPasswords(String pw, User user){
        if (pw==user.getPassword()){
            return user.getPassword();
        } else {
            return "passwords do not match";
        }
    }
}
