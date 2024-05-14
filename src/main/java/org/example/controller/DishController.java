package org.example.controller;

import org.example.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DishController {

    @Autowired
    private DishService service;

    @GetMapping("/")
    public String showHomePage(){
        return "home";

        @GetMapping("/dishes/add")
        public String showAddDishForm(Model model){
            return "add-dish";
        }
    }
}
