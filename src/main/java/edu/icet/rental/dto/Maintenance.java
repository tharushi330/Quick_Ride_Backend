package edu.icet.rental.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Maintenance {
    private Long maintenanceID;

    @NotNull(message = "This should not be blank")
    private Long vehicleID;

    @NotEmpty(message = "address should not be blank")
    private String description;

    @NotEmpty(message = "address should not be blank")
    private Double cost;

    @NotNull(message = "This should not be blank")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    private Date date;

}
