package edu.icet.rental.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private Long massageID;

    @NotEmpty(message = "should not be blank")
    private String name;

    @NotEmpty(message = "should not be blank")
    private String email;

    @NotEmpty(message = "should not be blank")
    private String phone;

    @NotEmpty(message = "should not be blank")
    private String message;
}
