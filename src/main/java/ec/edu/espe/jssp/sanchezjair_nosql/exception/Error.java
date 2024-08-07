package ec.edu.espe.jssp.sanchezjair_nosql.exception;

import lombok.Data;

@Data
public class Error {
    private String message;
    private int status;
    private Long timestamp;
}
