package com.company.tx.demo.composite.demo3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.company.tx.demo.composite.common.UserManager;
import com.company.tx.demo.composite.common.dto.UserDTO;
import com.company.tx.demo.composite.common.service.UserService;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

/**
 * @Author: Tangxuan
 * @Date: 2020/4/5 12:27
 */
@Slf4j
@Component
public class UserManagerImpl implements UserManager {

    @Qualifier(Constants.COMPOSITE)
    @Resource
    private UserService userService;

    /**
     * 获取聚合数据源后的总用户列表
     *
     * @return
     */
    @Override
    public List<UserDTO> getUserList() {
        log.info("demo3");
        return userService.getUserList();
    }
}
