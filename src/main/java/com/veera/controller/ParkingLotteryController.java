package com.veera.controller;

import com.veera.CustomLottery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/lottery")
public class ParkingLotteryController {

    @Autowired
    private CustomLottery customLottery;

    @GetMapping("/parking")
    public Map<String, Integer> startLottery(@RequestParam(value = "availSlots", required = true)int availSlots)
    {
        return customLottery.parkingSlotResults(availSlots);
    }
}