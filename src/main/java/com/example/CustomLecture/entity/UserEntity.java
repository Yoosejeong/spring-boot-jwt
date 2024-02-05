package com.example.CustomLecture.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Id 생성되는 방식 자동으로 생성, IDENTITY로 해야 겹치지 않음.
    private int id;

    private String username;
    private String password;

    //유저에 대한 권한을 나타낼  role값
    private String role;
}
