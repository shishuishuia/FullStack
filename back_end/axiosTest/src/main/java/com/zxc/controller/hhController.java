package com.zxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 晓梦之尘
 * more about author: www.shuishuia.cn
 * @ClassName hhController
 * @Description TODO
 * @date 2024/4/10 16:42
 * @Version 1.0
 */

@Controller
@CrossOrigin
public class hhController {

    @GetMapping("hh")
    @ResponseBody
    public String hh(){
        return "nihaoshijie";
    }

}
