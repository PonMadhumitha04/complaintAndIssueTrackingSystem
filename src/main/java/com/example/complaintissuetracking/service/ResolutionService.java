package com.example.complaintissuetracking.service;

import com.example.complaintissuetracking.entities.Complaint;
import com.example.complaintissuetracking.entities.Resolution;
import com.example.complaintissuetracking.repository.ComplaintRepository;
import com.example.complaintissuetracking.repository.ResolutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResolutionService {

    @Autowired
    private ResolutionRepository repository;

    @Autowired
    private ComplaintRepository complaintRepository;

    public Resolution addResolution(
            Resolution resolution){

        Complaint complaint =
                complaintRepository.findById(
                                resolution.getComplaintId())
                        .orElse(null);

        complaint.setStatus("RESOLVED");

        complaintRepository.save(complaint);

        return repository.save(resolution);
    }
}