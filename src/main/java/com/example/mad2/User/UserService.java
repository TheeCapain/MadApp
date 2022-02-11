package com.example.mad2.User;

public class UserService {

    private UserRepositoryInterface userRepositoryInterface;

    public UserService(UserRepositoryInterface userRepositoryInterface) {
        this.userRepositoryInterface = userRepositoryInterface;
    }


    public void createUser(String username, String email, String password, String passwordConfirm) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(validateMatchingPasswords(password,passwordConfirm));
        user.setEmail(email);

        userRepositoryInterface.createUser(user);
    }

    public User readUser(String userMail, String password) {
        return userRepositoryInterface.readUser(userMail,password);
    }


    public String validateMatchingPasswords(String pw, String pwConfirm) {
        if (pw.equals(pwConfirm)) {
            return pw;
        } else {
            //Exception here
            return "passwords do not match";
        }
    }


}
