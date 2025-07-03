package com.hbs.mcp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class ToolContextController {

    @GetMapping("/context/tools")
    public List<Map<String, String>> listTools() {
        return List.of(
            Map.of(
                "name", "BusArrivalsTool",
                "description", "Fetches real-time SG bus arrival timings",
                "openapi_url", "/v1/openapi.yaml"
            )
        );
    }
}
