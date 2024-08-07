package ec.edu.espe.jssp.sanchezjair_nosql.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "student")
public class Student {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;
    private String courseName;
    @CreatedDate
    private LocalDateTime created;
    @LastModifiedDate
    private LocalDateTime modified;
}
