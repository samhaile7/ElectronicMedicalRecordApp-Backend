package com.samuelhaile.emrapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

@RequestMapping ("/testingpatient")
    public String getTestMessage() {
        return "This is a message that should display";
    }
}
