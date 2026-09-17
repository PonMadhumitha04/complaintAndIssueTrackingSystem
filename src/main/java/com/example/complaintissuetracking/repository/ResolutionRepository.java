package com.example.complaintissuetracking.repository;

import com.example.complaintissuetracking.entities.Resolution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResolutionRepository
        extends JpaRepository<Resolution, Long> {
}