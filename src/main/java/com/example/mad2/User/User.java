package com.example.mad2.User;

public class User {

    private String username;
    private String Email;
    private String password;

    User(String username, String email, String password){
        this.username = username;
        this.Email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
