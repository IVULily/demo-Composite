package com.company.tx.demo.composite.demo6.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.company.tx.demo.composite.common.UserManager;
import com.company.tx.demo.composite.common.dto.UserDTO;
import com.company.tx.demo.composite.common.service.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Tangxuan
 * @Date: 2020/4/5 14:47
 */
@Slf4j
@Component
public class UserManagerImpl implements UserManager {

    @Composite
    @Resource
    private UserService userService;

    /**
     * 获取聚合数据源后的总用户列表
     *
     * @return
     */
    @Override
    public List<UserDTO> getUserList() {
        log.info("demo6");
        return userService.getUserList();
    }
}
