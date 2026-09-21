package com.example.complaintissuetracking.service;

import com.example.complaintissuetracking.entities.User;
import com.example.complaintissuetracking.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void shouldSaveUser() {

        User user = new User();
        user.setUserId(1L);
        user.setName("Madhu");
        user.setEmail("madhu@gmail.com");

        when(userRepository.save(any(User.class)))
                .thenReturn(user);

        User savedUser = userService.save(user);

        assertNotNull(savedUser);
        assertEquals("Madhu", savedUser.getName());

        verify(userRepository, times(1))
                .save(any(User.class));
    }
}