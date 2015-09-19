package com.example.controller;

import com.example.service.CustomerService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private static final Logger LOGGER = Logger.getLogger(CustomerController.class);

    @Autowired
    private CustomerService service;

    @RequestMapping(value = "/")
    public String home() {
        LOGGER.debug("home");
        return service.getHome();
    }
}
