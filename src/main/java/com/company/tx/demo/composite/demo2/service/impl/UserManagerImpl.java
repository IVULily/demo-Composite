package com.company.tx.demo.composite.demo2.service.impl;

import com.company.tx.demo.composite.common.UserManager;
import com.company.tx.demo.composite.common.dto.UserDTO;
import com.company.tx.demo.composite.common.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: Tangxuan
 * @Date: 2020/4/4 13:20
 */
@Slf4j
@Component
public class UserManagerImpl implements UserManager {

    @Qualifier("composite")
    private UserService userService;

    /**
     * 获取聚合数据源后的总用户列表
     *
     * @return
     */
    @Override
    public List<UserDTO> getUserList() {
        log.info("demo2");
        return userService.getUserList();
    }
}
