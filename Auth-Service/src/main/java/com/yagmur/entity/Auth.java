package com.yagmur.entity;

import com.yagmur.utility.enums.ERole;
import com.yagmur.utility.enums.EStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Auth extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String username;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    @Builder.Default //default value, defaultta user olmalı.
    private ERole role = ERole.USER;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private EStatus status = EStatus.PENDING;

/*
    Super Builder extend alınan sınıfın da consta işlenmesini sağlıyor
    public Auth(Long createDate, Long updateDate, Long id, String username, String email, String password, ERole role, EStatus status) {
        super(createDate, updateDate);
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.status = status;
    }
 */

}
