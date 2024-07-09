package mts.homework.sivelkaev.security.service;

import mts.homework.sivelkaev.security.model.entity.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    /**
     * @return Возвращает пользователя
     */
    UserDetailsService getUserDetailsService();

    /**
     * @param username - имя пользователя
     *
     * @return Возвращает пользователя
     */
    UserEntity getUser(String username);
}
