package br.com.eduardosilva.infrastructure.service;

import org.springframework.security.core.Authentication;

public interface JwtService {
    String generateToken(Authentication authentication);
    String generateRefreshToken(Authentication authentication);
    boolean validateToken(String token);
    boolean validateRefreshToken(String token);
    String getUsernameFromToken(String token);
    String generateTokenFromUsername(String username);
    String generateRefreshTokenFromUsername(String username);
}
