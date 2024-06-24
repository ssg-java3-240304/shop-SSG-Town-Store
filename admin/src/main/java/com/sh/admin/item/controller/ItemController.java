package com.sh.admin.item.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/item")
public class ItemController {

    @GetMapping("/list")
    public String list() {
        return "item/list";
    }

    @GetMapping("/create") // 상품등록 페이지
    public String create() {
        return "item/create";
    }

    @GetMapping("/update") // 상품수정 페이지
    public String update(){
        return "item/update";
    }


}
