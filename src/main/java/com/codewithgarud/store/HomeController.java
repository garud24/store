package com.codewithgarud.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private final OrderService orderService;

    public HomeController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/test-order")
    public String testOrder() {
        orderService.placeOrder();
        return "index.html";
    }
}
