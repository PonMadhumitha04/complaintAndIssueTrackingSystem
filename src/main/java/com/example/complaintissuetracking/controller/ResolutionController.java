package com.example.complaintissuetracking.controller;

import com.example.complaintissuetracking.entities.Resolution;
import com.example.complaintissuetracking.service.ResolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resolutions")
public class ResolutionController {

    @Autowired
    private ResolutionService service;

    @PostMapping
    public Resolution addResolution(
            @RequestBody Resolution resolution){

        return service.addResolution(resolution);
    }
}
