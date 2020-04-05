package com.company.tx.demo.composite.demo7.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: Tangxuan
 * @Date: 2020/4/5 16:29
 */
public class SimpleComponentSelector<T> implements ComponentSelector<T> {

    /**
     * 从配置中心获取(模拟)
     */
    private Map<String, String> map = new HashMap<String, String>();

    {
        // map.put(Constants.USER_SERVICE_SELECT_KEY, "");
        // map.put(Constants.USER_SERVICE_SELECT_KEY, "NewUserServiceImpl");
        // map.put(Constants.USER_SERVICE_SELECT_KEY, "OldUserServiceImpl");
        // map.put(Constants.USER_SERVICE_SELECT_KEY, "OldUserServiceImpl,NewUserServiceImpl");
    }

    /**
     * 从给定列表选择出激活的组件
     *
     * @param selectKey
     * @param list
     * @return
     */
    @Override
    public List<T> select(String selectKey, List<T> list) {
        if (selectKey == null) {
            return list;
        }
        String value = map.get(selectKey);
        if (value == null) {
            return list;
        }
        return list.stream()
                .filter(e -> value.contains(e.getClass().getSimpleName()))
                .collect(Collectors.toList());
    }

}
