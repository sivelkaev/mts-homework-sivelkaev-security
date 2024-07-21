package mts.homework.sivelkaev.security.controller.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SignInRequest {
    @NotBlank
    @JsonProperty(value = "username", required = true)
    private String username;

    @NotBlank
    @JsonProperty(value = "password", required = true)
    private String password;
}
