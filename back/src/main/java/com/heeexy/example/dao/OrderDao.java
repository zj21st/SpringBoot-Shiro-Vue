package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;


public interface OrderDao {
    int addOrder(JSONObject jsonObject);
    int countOrder(JSONObject jsonObject);
    List<JSONObject> listOrder(JSONObject jsonObject);

    int updateOrder(JSONObject jsonObject);
}
