package com.example.complaintissuetracking.dto;

import lombok.Data;

@Data
public class ResolutionDTO {

    private Long complaintId;
    private String resolutionText;
}