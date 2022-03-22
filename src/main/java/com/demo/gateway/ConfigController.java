package com.demo.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    
    private final StaticConfigService staticConfigService;

    private final DynamicConfigService dynamicConfigService;

    public ConfigController(StaticConfigService staticConfigService, DynamicConfigService dynamicConfigService) {
        this.staticConfigService = staticConfigService;
        this.dynamicConfigService = dynamicConfigService;
    }

    @GetMapping(value = "/static")
    public Object getConfigFromStatic() {
        return staticConfigService.getConfig();
    }

    @GetMapping(value = "/dynamic")
    public Object getConfigFromDynamic() {
        return dynamicConfigService.getConfig();
    }
}
