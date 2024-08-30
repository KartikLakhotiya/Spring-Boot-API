package com.example.hello.hello.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DataService {

    private final RestTemplate restTemplate;

    public DataService() {
        this.restTemplate = new RestTemplate();
    }

    public List<Object> fetchData() {
        String url = "https://jsonplaceholder.typicode.com/posts";
        Object[] response = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(response);
    }
}
