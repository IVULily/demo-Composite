package com.company.tx.demo.composite.demo7.service.impl;

import java.util.List;

/**
 *组件选择器
 *
 * @Author: Tangxuan
 * @Date: 2020/4/5 13:26
 */
public interface ComponentSelector<T> {

    /**
     * 从给定列表选择出激活的组件
     *
     * @param selectKey
     * @param list
     * @return
     */
    List<T> select(String selectKey, List<T> list);
}
