package com.example.CustomLecture.repository;

import com.example.CustomLecture.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    //중복되는 id 확인
    //jpa 구분 중 existby는 존재하는지 확인하는 쿼리절.
    Boolean existsByUsername(String username);

    //username을 받아 DB 테이블에서 회원을 조회하는 메소드 작성
    UserEntity findByUsername(String username);



}
