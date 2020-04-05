package com.company.tx.demo.composite.demo6.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.company.tx.demo.composite.common.dto.UserDTO;
import com.company.tx.demo.composite.common.service.UserService;

/**
 * 用户服务组合类
 *
 * @Author: Tangxuan
 * @Date: 2020/4/5 14:46
 */
@Composite
public class UserServiceComposite extends AbstractUserServiceComposite<UserService> implements UserService {

    /**
     * 获取用户列表，聚合数据源
     *
     * @return
     */
    @Override
    public List<UserDTO> getUserList() {

        List<UserDTO> allUserList = new ArrayList<>();
        for (UserService userService : this.getServiceList()) {
            List<UserDTO> userList = userService.getUserList();
            allUserList.addAll(userList);
        }

        return allUserList;
    }
}
