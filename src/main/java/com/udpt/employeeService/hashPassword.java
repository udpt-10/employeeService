package com.udpt.employeeService;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class hashPassword {
    public static String hash(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}