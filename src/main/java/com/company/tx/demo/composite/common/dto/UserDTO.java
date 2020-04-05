package com.company.tx.demo.composite.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 聚合类的用户DTO
 *
 * @Author: Tangxuan
 * @Date: 2020/4/5 11:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    /**
     * 数据来源，新系统
     */
    public static final Integer SOURCE_NOW = 1;

    /**
     * 数据来源，老系统
     */
    public static final Integer SOURCE_OLD = 2;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 数据来源
     */
    private Integer source;
}
