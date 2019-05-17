package com.mda.easy.service.impl;

import com.mda.easy.dao.UserRepository;
import com.mda.easy.exception.UserNotFoundException;
import com.mda.easy.model.User;
import com.mda.easy.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class UserServiceImplTest {

    @InjectMocks
    UserServiceImpl userService; // for able to call the getUser method and other method in user service implementation

    @Mock
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetUser() throws UserNotFoundException {
        User user = new User();
        user.setId(1);
        user.setLogin("jdin8692");
        user.setFirstName("Jacque");
        user.setLastName("Miller");
        user.setEmail("miller@example.com");

        // When the findByEmail method is called then return user".
        when( userRepository.findByEmail( anyString() ) ).thenReturn(user);

        User actual = userService.getUser("test@test.com");

        assertNotNull(actual);
        assertEquals("Jacque", actual.getFirstName());

        // When the findByEmail method is called then return null".
        //when( userRepository.findByEmail( anyString() ) ).thenReturn(null);
    }

    @Test
    void testGetUser_UserNotFoundException() throws UserNotFoundException {
        when( userRepository.findByEmail( anyString() ) ).thenReturn(null);

        UserNotFoundException exception = assertThrows(UserNotFoundException.class, () -> userService.getUser("test@test.com"));
        assertEquals("test@test.com", exception.getMessage());
    }
}