package com.microservices.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/userfallback")
    public String userFallBack(){
        return "User taking longer than expected";
    }

    @GetMapping("/departmentfallback")
    public String departmentFallBack(){
        return "Department taking longer than expected";
    }
}
