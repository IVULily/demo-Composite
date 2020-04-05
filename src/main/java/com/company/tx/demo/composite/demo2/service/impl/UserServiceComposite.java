package com.company.tx.demo.composite.demo2.service.impl;

import com.company.tx.demo.composite.common.dto.UserDTO;
import com.company.tx.demo.composite.common.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户服务组合类
 *
 * @Author: Tangxuan
 * @Date: 2020/4/4 13:20
 */
@Qualifier("composite")
public class UserServiceComposite implements UserService {

    @Qualifier("part")
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
