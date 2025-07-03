package com.hbs.mcp.client;

import com.hbs.mcp.generated.api.BusArrivalsApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "busArrivalsApi", url = "http://localhost:8688/api")
public interface BusArrivalsApiClient extends BusArrivalsApi {}
