package online.shixun.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.shixun.project.dao.UserDao;
import online.shixun.project.model.UserModel;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Long saveUser(UserModel user) {
        return userDao.save(user);
    }
}