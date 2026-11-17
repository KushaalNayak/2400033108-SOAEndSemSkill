
package com.klu.driver;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class DriverController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/driver")
    public String getDriver() {
        return "Hello from Driver Service! Port: " + port;
    }
}
