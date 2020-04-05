package com.company.tx.demo.composite.demo7.service.impl;

import java.util.List;

import javax.annotation.Resource;

/**
 * 服务抽象类，将具体实现抽象出来
 *
 * @Author: Tangxuan
 * @Date: 2020/4/5 15:12
 */
public abstract class AbstractUserServiceComposite<T> {

    @Part
    @Resource
    private List<T> serviceList;

    /**
     * 获取服务列表，此方法中可做各种操作，比如加过滤器，根据disconf配置决定激活哪些Service
     *
     * @return
     */
    protected List<T> getServiceList() {
        return serviceList;
    }

    /**
     * 获取单个服务，可做负载均衡
     *
     * @return
     */
    protected T getService() {
        return serviceList.get(0);
    }
}
