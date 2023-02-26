package com.bruno.launchevents.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter@Setter
@JsonPropertyOrder({"key", "name", "email", "password"})
public class UserDTO {
    @JsonProperty("id")
    private Integer key;
    @NotBlank(message = "Field 'name' is mandatory.")
    private String name;
    @Email(message = "Field 'email' is invalid.")
    private String email;
    @NotBlank(message = "Field 'password' is mandatory.")
    private String password;
}
