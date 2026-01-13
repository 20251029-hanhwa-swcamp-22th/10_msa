package com.beyond.userservice.auth.repository;

import com.beyond.userservice.auth.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<RefreshToken, String> {
}
