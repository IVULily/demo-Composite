package com.company.tx.demo.composite.demo7.service.impl;

import java.util.List;

/**
 *负载均衡
 *
 * @Author: Tangxuan
 * @Date: 2020/4/5 16:25
 */
public interface Loadbalancer<T> {

    /**
     * 选择一个组件
     *
     * @param list
     * @return
     */
    T choose(List<T> list);
}
