package com.company.tx.demo.composite.common.remote.now;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * 新数据源用户dubbo服务（模拟）
 *
 * @Author: Tangxuan
 * @Date: 2020/4/5 11:17
 */
@Service
public class NowUserService {

    /**
     * 获取用户列表
     *
     * @return 用户list
     */
    public List<NowUserDTO> getUserList() {
        return Arrays.asList(new NowUserDTO(1001L, "now1"), new NowUserDTO(1002L, "now2"),
                new NowUserDTO(1003L, "now3"));
    }
}
