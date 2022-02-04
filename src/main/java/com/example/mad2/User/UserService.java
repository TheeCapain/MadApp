package com.example.mad2.User;

public class UserService {

    public User createUser(String email, String username, String pw, String pwConfirm) {
        validateMatchingPasswords(pw, pwConfirm);
        return new User(username,email,pw);
    }

    public String validateMatchingPasswords(String pw, String pwConfirm) {
        if (pw.equals(pwConfirm)) {
            return pw;
        } else {
            return "passwords do not match";
        }
    }
}
