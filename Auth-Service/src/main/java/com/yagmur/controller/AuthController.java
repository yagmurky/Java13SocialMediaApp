package com.yagmur.controller;

import com.yagmur.dto.request.RegisterRequestDto;
import com.yagmur.dto.response.RegisterResponseDto;
import com.yagmur.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.yagmur.constans.RestApiUrl.AUTH;
import static com.yagmur.constans.RestApiUrl.REGISTER;

@RestController
@RequiredArgsConstructor
@RequestMapping(AUTH)
public class AuthController {

    private final AuthService authService;
    @PostMapping(REGISTER)
    public ResponseEntity<RegisterResponseDto> register(RegisterRequestDto dto) {
        return ResponseEntity.ok().body(authService.register(dto));
    }

}