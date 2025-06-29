package com.example.Custom;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testFindByName_ReturnsMatchingUsers() {
        // Arrange
        User user1 = new User(1L, "Alice");
        User user2 = new User(2L, "Bob");
        User user3 = new User(3L, "Alice");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        // Act
        List<User> result = userRepository.findByName("Alice");

        // Assert
        assertThat(result).hasSize(2);
        assertThat(result).extracting(User::getName).containsOnly("Alice");
    }
}
