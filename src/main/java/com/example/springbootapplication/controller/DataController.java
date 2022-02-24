package com.example.springbootapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

    // build get all employees REST API
    @GetMapping("/get")
    public String  getData(){
        return "Data Called";
    }


}
