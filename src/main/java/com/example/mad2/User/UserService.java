package com.example.mad2.User;

public class UserService {


    public String validateMatchingPasswords(String pw, String pwConfirm) {
        if (pw.equals(pwConfirm)) {
            return pw;
        } else {
            return "passwords do not match";
        }
    }


}
