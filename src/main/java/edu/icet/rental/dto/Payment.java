package edu.icet.rental.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import edu.icet.rental.util.PaymentMethod;
import edu.icet.rental.util.PaymentStatus;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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

    @NotNull(message = "Booking ID is required")
    private Long bookingID;

    @NotNull(message = "Amount is required")
    private Double amount;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd") // Match with React date input format
    private LocalDate paymentDate;

    @NotNull(message = "Payment method is required")
    private PaymentMethod method;

    @NotNull(message = "Payment status is required")
    private PaymentStatus status;
}
