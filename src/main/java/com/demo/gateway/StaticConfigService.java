package com.demo.gateway;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StaticConfigService {
    @Value("${demo.profile}")
    private String profile;

    @Value("${demo.comment}")
    private String comment;


    public Map<String, String> getConfig() {
        Map<String, String> map = new HashMap<>();

        map.put("profile", profile);
        map.put("comment", comment);

        return map;
    }
}
