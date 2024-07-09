package mts.homework.sivelkaev.security.service;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;

public interface JwtService {
    /**
     * @param user - пользователь
     *
     * @return Возвращает токен
     */
    String generateToken(UserDetails user);

    String generateToken(Map<String, Object> extraClaims, UserDetails userDetails);

    /**
     * Проверка токена на валидность
     *
     * @param token       токен
     * @param userDetails данные пользователя
     * @return true, если токен валиден
     */
    boolean isTokenValid(String token, UserDetails userDetails);

    /**
     * Извлечение имени пользователя из токена
     *
     * @param token токен
     * @return имя пользователя
     */
    String extractUserName(String token);
}
