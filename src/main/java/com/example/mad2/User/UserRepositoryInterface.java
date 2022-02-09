package com.example.mad2.User;

public interface UserRepositoryInterface extends JpaRepository {

    void createUser(User user);

    User readUser(User user);
}
