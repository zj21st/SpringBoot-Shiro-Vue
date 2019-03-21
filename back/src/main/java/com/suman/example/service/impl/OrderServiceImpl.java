package com.suman.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.suman.example.dao.OrderDao;
import com.suman.example.service.OrderService;
import com.suman.example.util.CommonUtil;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject addOrder(JSONObject jsonObject) {
    	orderDao.addOrder(jsonObject);
        return CommonUtil.successJson();
    }

    @Override
    public JSONObject listOrder(JSONObject jsonObject) {
        CommonUtil.fillPageParam(jsonObject);
        int count = orderDao.countOrder(jsonObject);
        List<JSONObject> list = orderDao.listOrder(jsonObject);
        return CommonUtil.successPage(jsonObject, list, count);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public JSONObject updateOrder(JSONObject jsonObject) {
    	orderDao.updateOrder(jsonObject);
        return CommonUtil.successJson();
    }


}
