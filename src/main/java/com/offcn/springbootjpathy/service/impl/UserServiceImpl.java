package com.offcn.springbootjpathy.service.impl;

import com.offcn.springbootjpathy.model.User;
import com.offcn.springbootjpathy.dao.UserRepository;
import com.offcn.springbootjpathy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuzhihao
 * @email 1835892026@qq.com
 * @date 2020/5/11
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public void updateUser(Long id, User user) {
        user.setId(id);
        userRepository.saveAndFlush(user);

    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
