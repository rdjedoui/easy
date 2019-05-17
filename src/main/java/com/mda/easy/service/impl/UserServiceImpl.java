package com.mda.easy.service.impl;

import com.mda.easy.dao.UserRepository;
import com.mda.easy.exception.UserNotFoundException;
import com.mda.easy.model.User;
import com.mda.easy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Integer id, User user) throws Exception {
        if (!userRepository.existsById(id)) throw new Exception("User with id " + id + " not exist");
        user.setId(id);
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteAllUser() {
        userRepository.deleteAll();
    }

    @Override
    public User getUser(String email) throws UserNotFoundException {
        User user = userRepository.findByEmail(email);
        if (user == null)
            throw new UserNotFoundException(email);

        return user;
    }

}
