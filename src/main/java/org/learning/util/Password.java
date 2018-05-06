package org.learning.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Password {

    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("secret"));
    }
}
