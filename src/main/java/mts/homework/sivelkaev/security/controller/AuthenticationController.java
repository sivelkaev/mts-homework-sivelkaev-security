package mts.homework.sivelkaev.security.controller;

import mts.homework.sivelkaev.security.controller.dto.request.SignInRequest;
import mts.homework.sivelkaev.security.controller.dto.response.SignInResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Validated
@RequestMapping(value = "mts-homework-sivelkaev-security/auth")
public interface AuthenticationController {
    @PostMapping(value = "/sign-in")
    SignInResponse signIn(@RequestBody @Valid SignInRequest req);
}
