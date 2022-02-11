package com.example.mad2.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryInterface {

    void createUser(User user);

    User readUser(String Email, String password);


}
