package com.example.complaintissuetracking.service;

import com.example.complaintissuetracking.entities.Complaint;
import com.example.complaintissuetracking.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintService {

    @Autowired
    private ComplaintRepository repository;

    public Complaint createComplaint(
            Complaint complaint){

        complaint.setStatus("OPEN");

        return repository.save(complaint);
    }

    public List<Complaint> getAllComplaints(){
        return repository.findAll();
    }

    public Complaint updateStatus(
            Long id,
            String status){

        Complaint complaint =
                repository.findById(id).orElse(null);

        complaint.setStatus(status);

        return repository.save(complaint);
    }
}