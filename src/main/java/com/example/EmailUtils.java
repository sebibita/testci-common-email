package com.example;

public class EmailUtils {
    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}


// test change
