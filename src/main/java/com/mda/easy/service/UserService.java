package com.mda.easy.service;

import com.mda.easy.dto.UserDTO;
import com.mda.easy.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUser();

    public User getUser(final Integer id);

    public User addUser(final User user);

    public User updateUser(Integer id, User user) throws Exception;

    public void deleteUser(final Integer id);

    public void deleteAllUser();
}
