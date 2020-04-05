package com.company.tx.demo.composite.demo1.service.impl;

import com.company.tx.demo.composite.common.dto.UserDTO;
import com.company.tx.demo.composite.common.remote.now.NowUserDTO;
import com.company.tx.demo.composite.common.remote.now.NowUserService;
import com.company.tx.demo.composite.common.remote.old.OldUserDTO;
import com.company.tx.demo.composite.common.remote.old.OldUserService;
import com.company.tx.demo.composite.common.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户服务接口实现类
 *
 * @Author: Tangxuan
 * @Date: 2020/4/4 12:31
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private OldUserService oldUserService;
    @Resource
    private NowUserService nowUserService;

    /**
     * 获取用户列表，聚合数据源,数据转换
     *
     * @return
     */
    @Override
    public List<UserDTO> getUserList() {
        List<UserDTO> userList = new ArrayList<>();

        List<OldUserDTO> oldUserList = oldUserService.getUserList();
        oldUserList.forEach(o -> userList.add(new UserDTO(o.getUserId(), o.getUserName(),UserDTO.SOURCE_OLD )));

        List<NowUserDTO> nowUserList = nowUserService.getUserList();
        nowUserList.forEach(n -> userList.add(new UserDTO(n.getUserId(), n.getUserName(),UserDTO.SOURCE_OLD )));

        return userList;
    }
}
