package com.smartcity.smartcity_guide.controller;

import org.springframework.ui.Model;
import com.smartcity.smartcity_guide.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PlaceController {

    @Autowired
    PlaceService service;

    @GetMapping("/")
    public String home(Model m) {
        m.addAttribute("places", service.getAllPlaces());
        return "index";
    }

    @GetMapping("/type/{type}")
    public String placesByType(@PathVariable String type, Model m) {
        m.addAttribute("places", service.getByType(type));
        return "index";
    }
}

