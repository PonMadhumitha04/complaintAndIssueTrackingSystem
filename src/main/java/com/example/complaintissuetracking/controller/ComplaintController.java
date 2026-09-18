package com.example.complaintissuetracking.controller;

import com.example.complaintissuetracking.entities.Complaint;
import com.example.complaintissuetracking.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/complaints")
public class ComplaintController {

    @Autowired
    private ComplaintService service;

    @PostMapping
    public Complaint createComplaint(
            @RequestBody Complaint complaint){

        return service.createComplaint(complaint);
    }

    @GetMapping
    public List<Complaint> getAllComplaints(){

        return service.getAllComplaints();
    }

    @PutMapping("/{id}/{status}")
    public Complaint updateStatus(
            @PathVariable Long id,
            @PathVariable String status){

        return service.updateStatus(id, status);
    }
}
