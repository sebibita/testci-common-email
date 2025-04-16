package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailUtilsTest {

    @Test
    void testValidEmail() {
        assertTrue(EmailUtils.isValidEmail("student@example.com"));
    }

    @Test
    void testInvalidEmail() {
        assertFalse(EmailUtils.isValidEmail("student.example.com"));
    }
}
