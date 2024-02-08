package com.yagmur.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder //Burası super class bu ve aşağıdaki anatosyon sayesinde bu sınıf içindeki fieldlar direkt extend edilecektir.
@MappedSuperclass
public class BaseEntity {
    private Long createDate;
    private Long updateDate;
}