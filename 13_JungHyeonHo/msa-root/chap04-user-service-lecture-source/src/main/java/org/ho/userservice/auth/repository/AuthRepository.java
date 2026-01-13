package org.ho.userservice.auth.repository;

import org.ho.userservice.auth.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<RefreshToken, String> {
}
