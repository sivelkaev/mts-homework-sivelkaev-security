package mts.homework.sivelkaev.security.controller.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mts.homework.sivelkaev.security.controller.AuthenticationController;
import mts.homework.sivelkaev.security.controller.dto.request.SignInRequest;
import mts.homework.sivelkaev.security.controller.dto.response.SignInResponse;
import mts.homework.sivelkaev.security.service.AuthenticationService;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AuthenticationControllerImpl implements AuthenticationController {
    private final AuthenticationService authenticationService;

    @Override
    public SignInResponse signIn(SignInRequest req) {
        return authenticationService.signIn(req);
    }
}
