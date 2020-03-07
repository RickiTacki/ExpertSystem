package com.app.expert.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER, ADMIN, EXPERT;

    @Override
    public String getAuthority(){
        return name();
    }
}
