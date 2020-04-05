package com.company.tx.demo.composite.common.remote.old;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 老数据源用户传输类
 *
 * @Author: Tangxuan
 * @Date: 2020/4/5 11:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OldUserDTO {

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

}
