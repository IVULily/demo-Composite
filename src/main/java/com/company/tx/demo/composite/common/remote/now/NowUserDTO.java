package com.company.tx.demo.composite.common.remote.now;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 新数据源用户传输类
 *
 * @Author: Tangxuan
 * @Date: 2020/4/5 11:14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NowUserDTO {

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

}
