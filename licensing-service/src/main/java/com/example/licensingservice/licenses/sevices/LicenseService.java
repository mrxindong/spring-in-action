package com.example.licensingservice.licenses.sevices;

import com.example.licensingservice.licenses.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenseService {

    @Autowired
    ServiceConfig config;

    public String getProperty(String name){
        return name+":"+config.getExampleProperty();
    }
}
