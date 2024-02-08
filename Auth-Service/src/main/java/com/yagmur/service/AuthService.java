package com.yagmur.service;

import com.yagmur.dto.request.RegisterRequestDto;
import com.yagmur.dto.response.RegisterResponseDto;
import com.yagmur.entity.Auth;
import com.yagmur.mapper.AuthMapper;
import com.yagmur.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthRepository authRepository;
    private final AuthMapper authMapper;

    public RegisterResponseDto register(RegisterRequestDto dto) {
        Auth auth = authMapper.toAuth(dto);
        auth.setCreateDate(System.currentTimeMillis());
        auth.setUpdateDate(System.currentTimeMillis());
        authRepository.save(auth);
        return authMapper.toRegisterResponseDto(auth);
    }
}
