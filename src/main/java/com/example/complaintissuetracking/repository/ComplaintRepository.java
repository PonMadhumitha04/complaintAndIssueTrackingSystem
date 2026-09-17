package com.example.complaintissuetracking.repository;

import com.example.complaintissuetracking.entities.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplaintRepository
        extends JpaRepository<Complaint, Long> {
}
