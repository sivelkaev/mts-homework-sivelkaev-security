package mts.homework.sivelkaev.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Validated
@RequestMapping(value = "mts-homework-sivelkaev-security")
public interface ApplicationController {
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping(value = "/admin")
    String helloAdmin();

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping(value = "/user")
    String helloUser();
}
