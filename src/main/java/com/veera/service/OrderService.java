package com.veera.service;

import com.veera.NotificationUtil;
import com.veera.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public Order createOrder(Order order) {
        String notificationSuccess = NotificationUtil.sendNotification("Msg send");
        String pvtMsg = testPvtMethod("123");
        return order;
    }

    private String testPvtMethod(String id) {
        System.out.println("======Inside private method - Begin======");
        System.out.println("======Inside private method - En=d=====");
        return "Sample Private";
    }
}