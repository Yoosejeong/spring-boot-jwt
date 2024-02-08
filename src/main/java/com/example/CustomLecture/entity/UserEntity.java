package com.example.CustomLecture.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user") // 테이블 이름 지정
@Setter
@Getter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Id 생성되는 방식 자동으로 생성, IDENTITY로 해야 겹치지 않음.
    private Long id;


    private String username;
    private String password;
    private String nickname;

    //유저에 대한 권한을 나타낼  role값
    private String role;

    public UserEntity(Long id, String username, String password, String nickname, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.role = role;
    }


    public UserEntity() {

    }
}
