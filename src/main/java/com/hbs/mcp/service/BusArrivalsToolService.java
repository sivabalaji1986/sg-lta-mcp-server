package com.hbs.mcp.service;

import com.hbs.mcp.client.BusArrivalsApiClient;
import com.hbs.mcp.generated.model.LTABusStopResponse;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class BusArrivalsToolService {
    private final BusArrivalsApiClient client;

    public BusArrivalsToolService(BusArrivalsApiClient client) {
        this.client = client;
    }

    @Tool(description = "Fetches real-time SG bus arrival timings")
    public LTABusStopResponse getBusArrivals(Integer busStopCode, String serviceNo) {
        return client.getBusStopTimings(busStopCode, serviceNo).getBody();
    }
}