# SG LTA MCP Server

This project implements a **Model Context Protocol (MCP) Server** that provides a tool to fetch real-time bus arrival information from Singapore's Land Transport Authority (LTA). The MCP server integrates with Claude Desktop or any local LLM-enabled environment via standard input/output, enabling conversational agents to query for bus arrivals.

## 🧩 Key Components

- **Spring Boot 3.5.3**
- **Java 21**
- **Spring AI MCP Server (STDIO-based)**
- **Feign client** for calling the `sg-lta-bus-arrivals` service
- **OpenAPI-based interface** for tool specification and code generation

## 🔧 Setup

### Prerequisites

- Java 21
- Maven 3.8+
- `sg-lta-bus-arrivals` service running at `http://localhost:8688`

### Configuration

```yaml
# application.yml
server:
  port: 8689
  servlet:
    contextPath: /mcp

sg-lta:
  base-url: http://localhost:8688
