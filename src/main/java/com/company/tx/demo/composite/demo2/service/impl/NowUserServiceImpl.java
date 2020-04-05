package com.company.tx.demo.composite.demo2.service.impl;

import com.company.tx.demo.composite.common.dto.UserDTO;
import com.company.tx.demo.composite.common.remote.now.NowUserDTO;
import com.company.tx.demo.composite.common.remote.now.NowUserService;
import com.company.tx.demo.composite.common.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 *新数据源用户实现
 *
 * @Author: Tangxuan
 * @Date: 2020/4/4 13:11
 */
@Qualifier("part")
public class NowUserServiceImpl implements UserService {

    @Resource
    private NowUserService nowUserService;

    /**
     * 获取用户列表，新数据源做数据转换
     *
     * @return
     */
    @Override
    public List<UserDTO> getUserList() {
        List<UserDTO> userList = new ArrayList<>();
        List<NowUserDTO> nowUserList = nowUserService.getUserList();
        nowUserList.forEach(n -> userList.add(new UserDTO(n.getUserId(), n.getUserName(),UserDTO.SOURCE_OLD )));
        return userList;
    }
}
