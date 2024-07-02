package mts.homework.sivelkaev.security.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Validated
@RequestMapping(value = "mts-homework-sivelkaev-security")
public interface ApplicationController {
    @GetMapping(value = "/admin")
    String helloAdmin();

    @GetMapping(value = "/user")
    String helloUser();
}
