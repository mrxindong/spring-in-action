package com.example.licensingservice.licenses.controllers;

import com.example.licensingservice.licenses.sevices.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @Autowired
    LicenseService licenseService;

    @RequestMapping(value = "/{licenseId}",method  = RequestMethod.GET)
    public String getLiscenses(@PathVariable("organizationId") String organizationId,
                               @PathVariable("licenseId") String licenseId){
        return licenseService.getProperty(organizationId+":"+licenseId);
    }
}
