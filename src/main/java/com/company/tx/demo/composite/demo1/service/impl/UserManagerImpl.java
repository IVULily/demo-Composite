package com.company.tx.demo.composite.demo1.service.impl;

import com.company.tx.demo.composite.common.UserManager;
import com.company.tx.demo.composite.common.dto.UserDTO;
import com.company.tx.demo.composite.common.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户管理器实现类
 *
 * @Author: Tangxuan
 * @Date: 2020/4/4 12:31
 */
@Slf4j
@Component
public class UserManagerImpl implements UserManager {

    @Resource
    private UserService userService;

    /**
     * 获取聚合数据源后的总用户列表
     *
     * @return
     */
    @Override
    public List<UserDTO> getUserList() {
        log.info("demo1");
        return userService.getUserList();
    }
}
