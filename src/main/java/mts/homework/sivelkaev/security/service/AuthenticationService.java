package mts.homework.sivelkaev.security.service;

import mts.homework.sivelkaev.security.controller.dto.request.SignInRequest;
import mts.homework.sivelkaev.security.controller.dto.response.SignInResponse;

public interface AuthenticationService {
    /**
     * @param req - идентификатор запроса
     *
     * @return Возвращает токен
     */
    SignInResponse signIn(SignInRequest req);
}
