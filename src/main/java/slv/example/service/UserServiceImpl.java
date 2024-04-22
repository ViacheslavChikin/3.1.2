package slv.example.service;


import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import slv.example.dao.UserDao;
import slv.example.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;


    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

    @Override
    @Transactional
    public void editUser(User user) {
        userDao.editUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
