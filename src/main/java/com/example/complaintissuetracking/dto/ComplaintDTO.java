package com.example.complaintissuetracking.dto;

import lombok.Data;

@Data
public class ComplaintDTO {

    private String title;
    private String description;
    private Long userId;
}