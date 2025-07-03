package com.hbs.mcp.controller;

import com.hbs.mcp.generated.api.BusArrivalsApi;
import com.hbs.mcp.generated.model.LTABusStopResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MCPController {

    @Autowired
    private BusArrivalsApi busArrivalsApi;

    @GetMapping("/bus-arrivals")
    public LTABusStopResponse proxy(@RequestParam Integer busStopCode,
                                    @RequestParam String serviceNo) {
        return busArrivalsApi.getBusStopTimings(busStopCode, serviceNo).getBody();
    }
}
