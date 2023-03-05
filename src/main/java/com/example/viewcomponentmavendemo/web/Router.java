package com.example.viewcomponentmavendemo.web;

import com.example.viewcomponentmavendemo.web.home.HomeViewComponent;
import de.tschuehly.thymeleafviewcomponent.ViewContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Router {
    private final HomeViewComponent homeViewComponent;

    public Router(HomeViewComponent homeViewComponent) {
        this.homeViewComponent = homeViewComponent;
    }

    @GetMapping("/")
    ViewContext testView(){
        return homeViewComponent.render();
    }
}
