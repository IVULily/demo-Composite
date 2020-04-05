package com.company.tx.demo.composite.demo5.service.impl;

import com.company.tx.demo.composite.common.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户服务抽象类，将具体实现抽象出来
 *
 * @Author: Tangxuan
 * @Date: 2020/4/5 15:12
 */
public abstract class AbstractUserServiceComposite implements UserService {

    @Part
    @Resource
    private List<UserService> userServiceList;

    /**
     * 获取用户列表服务，此方法中可做各种操作，比如加过滤器，根据disconf配置决定激活哪些userService
     *
     * @return
     */
    protected List<UserService> getUserServiceList() {
        return userServiceList;
    }

    /**
     * 获取单个服务，可做负载均衡
     *
     * @return
     */
    protected UserService getUserService() {
        return userServiceList.get(0);
    }
}
