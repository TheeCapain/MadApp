package com.example.mad2.User;

public class UserService {
    private final UserRepositoryInterface userRepositoryInterface;

    public UserService(UserRepositoryInterface userRepositoryInterface) {
        this.userRepositoryInterface = userRepositoryInterface;
    }

    public void createUser(String email, String username, String pw, String pwConfirm) {
        validateMatchingPasswords(pw, pwConfirm);
        userRepositoryInterface.createUser(new User(username, email, pw));
    }
/*
    public User readUser(String name, String password){

        return userRepositoryInterface.readUser( new User());
    }
*/
    public String validateMatchingPasswords(String pw, String pwConfirm) {
        if (pw.equals(pwConfirm)) {
            return pw;
        } else {
            return "passwords do not match";
        }
    }
}
