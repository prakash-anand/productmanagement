package com.product.management.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class ResourceContoller {
    @RequestMapping("/")
    public String welcome(){
        return "Hello. Welcome to ProductManagement";
    }
    @RequestMapping("/create")
    public String create(){
        return "This API will help you create product. Please provide data in required format";
    }

}
