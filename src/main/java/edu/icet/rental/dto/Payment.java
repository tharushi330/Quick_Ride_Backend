package edu.icet.rental.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import edu.icet.rental.util.PaymentMethod;
import edu.icet.rental.util.PaymentStatus;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Payment {
    private Long paymentID;

    @NotEmpty(message = "This should not be blank")
    private Long bookingID;

    @NotEmpty(message = "This should not be blank")
    private Double amount;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate paymentDate;

    @NotEmpty(message = "This should not be blank")
    private PaymentMethod method;

    @NotEmpty(message = "This should not be blank")
    private PaymentStatus status;
}
