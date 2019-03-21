package com.suman.example.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @description: 文章Dao层
 */
public interface ArticleDao {
 
    int addArticle(JSONObject jsonObject);

     int countArticle(JSONObject jsonObject);
    List<JSONObject> listArticle(JSONObject jsonObject);

     int updateArticle(JSONObject jsonObject);
}
