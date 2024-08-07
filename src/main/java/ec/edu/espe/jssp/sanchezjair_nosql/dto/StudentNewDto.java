package ec.edu.espe.jssp.sanchezjair_nosql.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StudentNewDto {
    private String id;

    @NotNull(message = "firstName cannot be empty")
    @Size(min = 2, max = 30, message = "firstName must be at least 2 letters and not more than 30 letters")
    private String firstName;

    @NotNull(message = "lastName cannot be empty")
    @Size(min = 2, max = 30, message = "lastName must be at least 2 letters and not more than 30 letters")
    private String lastName;

    @NotEmpty(message = "email cannot be empty")
    @Email(message = "email should be a valid email address")
    private String email;

    private String contactNumber;
    private String courseName;
    private LocalDateTime created;
    private LocalDateTime modified;
}
