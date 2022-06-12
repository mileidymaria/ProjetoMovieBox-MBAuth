package com.mb.auth.controller;

import com.mb.auth.model.dto.UserAuthDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mb/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody UserAuthDto userAuthDto){
        return ResponseEntity.ok("Login realizado!");
    }
}
