package com.company.tx.demo.composite.common.remote.old;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 老数据源用户dubbo服务（模拟）
 *
 * @Author: Tangxuan
 * @Date: 2020/4/5 11:14
 */
@Service
public class OldUserService {

    /**
     * 获取用户列表
     *
     * @return 用户list
     */
    public List<OldUserDTO> getUserList() {
        return Arrays.asList(new OldUserDTO(1001L, "now1"), new OldUserDTO(1002L, "now2"),
                new OldUserDTO(1003L, "now3"));
    }
}
