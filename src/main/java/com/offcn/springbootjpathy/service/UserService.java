package com.offcn.springbootjpathy.service;

import com.offcn.springbootjpathy.model.User;

import java.util.List;

/**
 * @author liuzhihao
 * @email 1835892026@qq.com
 * @date 2020/5/11
 */
public interface UserService {

    /**
     * 获取全部用户数据
     * @return
     */
    public List<User> getUserList();

    /**
     * 新增用户数据
     * @param user
     */
    public void createUser(User user);

    /**
     * 获取指定id用户信息
     * @param id
     * @return
     */
    public User getUser(Long id);

    /**
     * 更新指定id用户信息
     * @param id
     * @param user
     */
    public void updateUser(Long id,User user);

    /**
     * 删除指定id用户
     * @param id
     */
    public void deleteUser(Long id);

}
