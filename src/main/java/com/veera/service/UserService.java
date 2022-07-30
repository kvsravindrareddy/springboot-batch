package com.veera.service;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private ApplicationContext applicationContext;

//    @Autowired
//    private ObjectFactory<WeatherService> objectFactory;

    public String getTempDetails() {
        //return applicationContext.getBean(WeatherService.class).currentTemp();
//        return objectFactory.getObject().currentTemp();
        return getWeatherServiceBean().currentTemp();
    }

    @Lookup
    public WeatherService getWeatherServiceBean() {
        return null;
    }
}