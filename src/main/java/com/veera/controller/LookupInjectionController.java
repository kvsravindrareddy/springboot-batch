package com.veera.controller;

import com.veera.service.UserService;
import com.veera.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Scope("prototype")
public class LookupInjectionController {

    @Autowired
    private UserService userService;

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public List<String> getWeatherDetails() throws InterruptedException {
        String response1 = userService.getTempDetails();
        Thread.sleep(1000);
        String response2 = userService.getTempDetails();
        return Arrays.asList(response1, response2);
    }


    @GetMapping("/weatherprototype")
    public List<String> getWeatherDetailsPrototype() throws InterruptedException {
        String response1 = weatherService.currentTemp();
        Thread.sleep(1000);
        String response2 = weatherService.currentTemp();
        return Arrays.asList(response1, response2);
    }

}