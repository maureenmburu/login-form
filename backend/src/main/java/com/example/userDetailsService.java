package com.example;

import org.springframework.security.core.userdetails.UserDetails;

public interface userDetailsService {

    static UserDetails loadUserByUserId(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadUserByUserId'");
    }

}
