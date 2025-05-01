package edu.icet.rental.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import edu.icet.rental.util.PaymentMethod;
import edu.icet.rental.util.PaymentStatus;
import jakarta.persistence.*;
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
@Entity
@Table(name = "payment")
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentID;

    @NotNull(message = "Booking ID should not be null")
    private Long bookingID;

    @NotNull(message = "Amount should not be null")
    private Double amount;

    @NotNull(message = "Payment date is required")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate paymentDate;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Payment method is required")
    private PaymentMethod method;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Payment status is required")
    private PaymentStatus status;
}
