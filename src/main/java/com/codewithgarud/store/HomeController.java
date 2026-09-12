package com.codewithgarud.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
        String viewName = getViewname();
        return viewName;
    }

    private String getViewname(){
        return "index.html";
    }
}
