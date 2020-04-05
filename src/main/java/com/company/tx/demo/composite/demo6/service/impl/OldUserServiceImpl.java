package com.company.tx.demo.composite.demo6.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.company.tx.demo.composite.common.dto.UserDTO;
import com.company.tx.demo.composite.common.remote.old.OldUserDTO;
import com.company.tx.demo.composite.common.remote.old.OldUserService;
import com.company.tx.demo.composite.common.service.UserService;

/**
 * @Author: Tangxuan
 * @Date: 2020/4/5 14:38
 */
@Part
public class OldUserServiceImpl implements UserService {

    @Resource
    private OldUserService oldUserService;

    /**
     * 获取用户列表，新数据源做数据转换
     *
     * @return
     */
    @Override
    public List<UserDTO> getUserList() {
        List<UserDTO> userList = new ArrayList<>();
        List<OldUserDTO> oldUserList = oldUserService.getUserList();
        oldUserList.forEach(o -> userList.add(new UserDTO(o.getUserId(), o.getUserName(),UserDTO.SOURCE_OLD )));
        return userList;
    }
}
