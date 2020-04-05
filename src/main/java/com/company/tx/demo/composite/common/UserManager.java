package com.company.tx.demo.composite.common;

import com.company.tx.demo.composite.common.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理器，用于对外提供用户数据的唯一接口
 *
 * @Author: Tangxuan
 * @Date: 2020/4/5 11:31
 */
public interface UserManager {

    /**
     * 获取聚合数据源后的总用户列表
     *
     * @return
     */
    List<UserDTO> getUserList();

}
