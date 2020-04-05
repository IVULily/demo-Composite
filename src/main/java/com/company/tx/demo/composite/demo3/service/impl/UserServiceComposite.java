package com.company.tx.demo.composite.demo3.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;

import com.company.tx.demo.composite.common.dto.UserDTO;
import com.company.tx.demo.composite.common.service.UserService;

import javax.annotation.Resource;

/**
 * 用户服务组合类
 *
 * @Author: Tangxuan
 * @Date: 2020/4/5 12:28
 */
@Qualifier(Constants.COMPOSITE)
public class UserServiceComposite implements UserService {

    @Qualifier(Constants.PART)
    @Resource
    private List<UserService> userServiceList;

    /**
     * 获取用户列表，聚合数据源
     *
     * @return
     */
    @Override
    public List<UserDTO> getUserList() {

        List<UserDTO> allUserList = new ArrayList<>();
        for (UserService userService : userServiceList) {
            List<UserDTO> userList = userService.getUserList();
            allUserList.addAll(userList);
        }

        return allUserList;
    }
}
