package com.example.complaintissuetracking.service;



import com.example.complaintissuetracking.entities.Complaint;
import com.example.complaintissuetracking.repository.ComplaintRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ComplaintServiceTest {

    @Mock
    private ComplaintRepository complaintRepository;

    @InjectMocks
    private ComplaintService complaintService;

    @Test
    void shouldCreateComplaint() {

        Complaint complaint = new Complaint();

        complaint.setComplaintId(1L);
        complaint.setTitle("Laptop Issue");
        complaint.setDescription("System hanging");

        when(complaintRepository.save(any(Complaint.class)))
                .thenReturn(complaint);

        Complaint result =
                complaintService.createComplaint(complaint);

        assertNotNull(result);
        assertEquals("Laptop Issue",
                result.getTitle());

        verify(complaintRepository,
                times(1))
                .save(any(Complaint.class));
    }
}