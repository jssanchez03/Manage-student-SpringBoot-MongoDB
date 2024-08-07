package ec.edu.espe.jssp.sanchezjair_nosql.exception;

public class ResourceNotFoundException extends  RuntimeException{
    private static final long serialVersionUID = 1L;
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
