package com.example.crud_bt2_buiquangminh.repository;

import com.example.crud_bt2_buiquangminh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {
}
