package com.hbs.mcp.controller;

import com.hbs.mcp.generated.api.BusArrivalsApi;
import com.hbs.mcp.generated.model.LTABusStopResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mcp")
public class MCPController {

    @Autowired
    private BusArrivalsApi busArrivalsApi;

    @GetMapping("/predict")
    public ResponseEntity<LTABusStopResponse> predict(@RequestParam int busStopCode, @RequestParam String serviceNo) {
        return busArrivalsApi.getBusStopTimings(busStopCode, serviceNo);
    }
}
