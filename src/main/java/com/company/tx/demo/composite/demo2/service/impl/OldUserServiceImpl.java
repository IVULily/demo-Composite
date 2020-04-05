package com.company.tx.demo.composite.demo2.service.impl;

import com.company.tx.demo.composite.common.dto.UserDTO;
import com.company.tx.demo.composite.common.remote.old.OldUserDTO;
import com.company.tx.demo.composite.common.remote.old.OldUserService;
import com.company.tx.demo.composite.common.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Tangxuan
 * @Date: 2020/4/4 13:11
 */
@Qualifier("part")
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
