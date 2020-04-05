package com.company.tx.demo.composite.common.service;

import com.company.tx.demo.composite.common.dto.UserDTO;

import java.util.List;

/**
 * 用户服务接口
 *
 * @Author: Tangxuan
 * @Date: 2020/4/5 11:33
 */
public interface UserService {

    /**
     * 获取用户列表，聚合数据源的顶层接口
     *
     * @return
     */
    List<UserDTO> getUserList();
}
