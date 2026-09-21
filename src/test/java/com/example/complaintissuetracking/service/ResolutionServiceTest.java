package com.example.complaintissuetracking.service;

import com.example.complaintissuetracking.entities.Complaint;
import com.example.complaintissuetracking.entities.Resolution;
import com.example.complaintissuetracking.repository.ComplaintRepository;
import com.example.complaintissuetracking.repository.ResolutionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ResolutionServiceTest {

    @Mock
    private ResolutionRepository resolutionRepository;

    @Mock
    private ComplaintRepository complaintRepository;

    @InjectMocks
    private ResolutionService service;

    @Test
    void shouldAddResolution() {

        Complaint complaint = new Complaint();

        complaint.setComplaintId(1L);
        complaint.setStatus("OPEN");

        Resolution resolution = new Resolution();

        resolution.setComplaintId(1L);
        resolution.setResolutionText("RAM upgraded");

        when(complaintRepository.findById(1L))
                .thenReturn(Optional.of(complaint));

        when(resolutionRepository.save(any()))
                .thenReturn(resolution);

        Resolution result =
                service.addResolution(resolution);

        assertNotNull(result);

        verify(resolutionRepository)
                .save(any());
    }
}