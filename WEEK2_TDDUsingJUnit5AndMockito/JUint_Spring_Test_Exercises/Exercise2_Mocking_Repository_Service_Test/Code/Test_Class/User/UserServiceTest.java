package com.example.User;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    public UserServiceTest() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    void testGetUserById_UserExists() {
        // Arrange
        User user = new User(1L, "Alice");
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        // Act
        User result = userService.getUserById(1L);

        // Assert
        assertNotNull(result);
        assertEquals("Alice", result.getName());
        verify(userRepository).findById(1L);
    }

    @Test
    void testGetUserById_UserNotFound() {
        // Arrange
        when(userRepository.findById(2L)).thenReturn(Optional.empty());

        // Act
        User result = userService.getUserById(2L);

        // Assert
        assertNull(result);
        verify(userRepository).findById(2L);
    }
}
