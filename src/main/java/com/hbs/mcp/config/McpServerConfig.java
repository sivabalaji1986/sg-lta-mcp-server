package com.hbs.mcp.config;

import com.hbs.mcp.service.BusArrivalsToolService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;

@Configuration
public class McpServerConfig {
    @Bean
    public ToolCallbackProvider busArrivalsTools(BusArrivalsToolService service) {
        return MethodToolCallbackProvider.builder().toolObjects(service).build();
    }
}