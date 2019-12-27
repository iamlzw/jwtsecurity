package com.example.jwtsecurity.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class JwtResponse implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;
    private String username;
    public JwtResponse(String jwttoken,String username) {
        this.jwttoken = jwttoken;
        this.username = username;
    }
    public String getToken() {
        return this.jwttoken;
    }
}
