package com.samuelhaile.emrapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path ="/patient")
public class PatientController {

@RequestMapping (path = "/testingpatient", method = RequestMethod.GET)
    public String getTestMessage() {
        return "This is a message that should display";
    }
}
