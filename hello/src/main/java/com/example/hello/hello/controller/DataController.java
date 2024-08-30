package com.example.hello.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.hello.hello.service.DataService;

@Controller
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/data")
    public ResponseEntity<List<Object>> getData() {
        List<Object> data = dataService.fetchData();
        return ResponseEntity.ok(data);
    }
}
