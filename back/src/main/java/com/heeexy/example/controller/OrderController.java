package com.heeexy.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.service.ArticleService;
import com.heeexy.example.service.OrderService;
import com.heeexy.example.util.CommonUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @RequiresPermissions("order:list")
    @GetMapping("/listorder")
    public JSONObject listArticle(HttpServletRequest request) {
    	System.out.println("-----listorder----");
        return orderService.listOrder(CommonUtil.request2Json(request));
    }


    @RequiresPermissions("order:add")
    @PostMapping("/addorder")
    public JSONObject addArticle(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, "content");
        return orderService.addOrder(requestJson);
    }


    @RequiresPermissions("order:update")
    @PostMapping("/updateorder")
    public JSONObject updateArticle(@RequestBody JSONObject requestJson) {
        CommonUtil.hasAllRequired(requestJson, "id,content");
        return orderService.updateOrder(requestJson);
    }
}
