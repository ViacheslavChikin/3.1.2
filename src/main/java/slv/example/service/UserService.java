package slv.example.service;


import slv.example.models.User;

import java.util.List;

public interface UserService {
//    void addUser(User user);

    void deleteUser(Long id);

    void editUser(User user );

    User getUserById(Long id);
    List<User> getUsers();
}
