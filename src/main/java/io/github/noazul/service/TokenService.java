package io.github.noazul.service;

import org.springframework.security.core.Authentication;

public interface TokenService {

    String gerarToken(Authentication authentication);
}
