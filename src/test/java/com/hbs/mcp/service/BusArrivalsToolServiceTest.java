package com.hbs.mcp.service;

import com.hbs.mcp.client.BusArrivalsApiClient;
import com.hbs.mcp.generated.model.LTABusStopResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BusArrivalsToolServiceTest {

    private BusArrivalsApiClient mockClient;
    private BusArrivalsToolService toolService;

    @BeforeEach
    void setUp() {
        mockClient = Mockito.mock(BusArrivalsApiClient.class);
        toolService = new BusArrivalsToolService(mockClient);
    }

    @Test
    void shouldReturnBusArrivalData() {
        LTABusStopResponse dummyResponse = new LTABusStopResponse();
        dummyResponse.setBusStopCode("12345");

        when(mockClient.getBusStopTimings(12345, null))
                .thenReturn(new ResponseEntity<>(dummyResponse, HttpStatus.OK));

        var result = toolService.getBusArrivals(12345, null);
        assertNotNull(result);
        assertEquals("12345", result.getBusStopCode());

        verify(mockClient, times(1)).getBusStopTimings(12345, null);
    }

    @Test
    void shouldHandleNullResponse() {
        when(mockClient.getBusStopTimings(any(), any()))
                .thenReturn(new ResponseEntity<>(null, HttpStatus.OK));

        var result = toolService.getBusArrivals(99999, null);
        assertNull(result);
    }
}
