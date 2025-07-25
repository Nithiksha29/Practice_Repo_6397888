package com.example.SerMockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetUserById_UserExists() {
        // Arrange
        User user = new User();
        user.setId(1L);
        user.setName("Alice");

        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        // Act
        User result = userService.getUserById(1L);

        // Assert
        assertNotNull(result);
        assertEquals(1L, result.getId());
        assertEquals("Alice", result.getName());
        verify(userRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetUserById_UserDoesNotExist() {
        // Arrange
        when(userRepository.findById(2L)).thenReturn(Optional.empty());

        // Act
        User result = userService.getUserById(2L);

        // Assert
        assertNull(result);
        verify(userRepository, times(1)).findById(2L);
    }
}
