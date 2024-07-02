package mts.homework.sivelkaev.security.controller.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mts.homework.sivelkaev.security.controller.ApplicationController;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ApplicationControllerImpl implements ApplicationController {
    @Override
    public String helloAdmin() {
        return "Hello, Admin!";
    }

    @Override
    public String helloUser() {
        return "Hello, User!";
    }
}
