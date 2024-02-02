package com.example.springbootproductseller.service;

import com.example.springbootproductseller.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
