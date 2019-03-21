package com.suman.example.service;

import com.alibaba.fastjson.JSONObject;


public interface ArticleService {
    /**
     * 新增文章
     *
     * @param jsonObject
     * @return
     */
    JSONObject addArticle(JSONObject jsonObject);

    /**
     * 文章列表
     *
     * @param jsonObject
     * @return
     */
    JSONObject listArticle(JSONObject jsonObject);

    /**
     * 更新文章
     *
     * @param jsonObject
     * @return
     */
    JSONObject updateArticle(JSONObject jsonObject);
}
