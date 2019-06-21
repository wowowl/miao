package cn.edu.bjut.main.controller;

import cn.edu.bjut.OrderService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Reference(check = false)
    private OrderService orderService;

    @RequestMapping("/hello")
    public String hello() {
        boolean hello = orderService.createOrder();
        return hello+"";
    }
}
