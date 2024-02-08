package com.yagmur.mapper;

import com.yagmur.dto.request.RegisterRequestDto;
import com.yagmur.dto.response.RegisterResponseDto;
import com.yagmur.entity.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthMapper {
    AuthMapper INSTANCE = Mappers.getMapper(AuthMapper.class);
    Auth toAuth(RegisterRequestDto dto);
    RegisterResponseDto toRegisterResponseDto(Auth auth);

}
