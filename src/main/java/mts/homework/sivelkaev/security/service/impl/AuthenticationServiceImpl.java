package mts.homework.sivelkaev.security.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mts.homework.sivelkaev.security.controller.dto.request.SignInRequest;
import mts.homework.sivelkaev.security.controller.dto.response.SignInResponse;
import mts.homework.sivelkaev.security.service.AuthenticationService;
import mts.homework.sivelkaev.security.service.JwtService;
import mts.homework.sivelkaev.security.service.UserService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final AuthenticationManager authenticationManager;
    private final UserService userService;
    private final JwtService jwtService;

    @Override
    public SignInResponse signIn(SignInRequest req) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword()));

        var user = userService
                .getUserDetailsService()
                .loadUserByUsername(req.getUsername());

        var jwt = jwtService.generateToken(user);

        return new SignInResponse(jwt);
    }
}
