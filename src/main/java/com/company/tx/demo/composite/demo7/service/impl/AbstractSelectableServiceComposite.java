package com.company.tx.demo.composite.demo7.service.impl;

import javax.annotation.Resource;
import java.util.List;

/**
 *提供组件选择功能
 *
 * @Author: Tangxuan
 * @Date: 2020/4/5 16:37
 */
public class AbstractSelectableServiceComposite<T> extends AbstractUserServiceComposite<T> {
    @Resource
    private ComponentSelector<T> componentSelector;

    /**
     * 获取选择后的服务列表
     *
     * @return
     */
    protected List<T> getSelectedServiceList() {
        String selectKey = getSelectKey();
        if (selectKey == null) {
            return getServiceList();
        }
        return componentSelector.select(selectKey, getServiceList());
    }

    /**
     * 获取组件选择的key
     *
     * @return
     */
    protected String getSelectKey() {
        return null;
    }
}
