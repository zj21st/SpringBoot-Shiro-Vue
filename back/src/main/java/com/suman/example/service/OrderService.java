package com.suman.example.service;

import com.alibaba.fastjson.JSONObject;


public interface OrderService {
    JSONObject addOrder(JSONObject jsonObject);
    JSONObject listOrder(JSONObject jsonObject);
    JSONObject updateOrder(JSONObject jsonObject);
}
