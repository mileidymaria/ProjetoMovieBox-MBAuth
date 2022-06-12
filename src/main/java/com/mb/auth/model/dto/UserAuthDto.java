package com.mb.auth.model.dto;

import com.mb.auth.model.enums.Role;

public class UserAuthDto {
    private Role role;
    private String username;
    private String password;

    public UserAuthDto(Role role, String username, String password) {
        this.role = role;
        this.username = username;
        this.password = password;
    }

    public UserAuthDto() {
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
