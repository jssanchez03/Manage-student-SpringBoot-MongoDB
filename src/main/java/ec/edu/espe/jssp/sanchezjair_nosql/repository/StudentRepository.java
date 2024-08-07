package ec.edu.espe.jssp.sanchezjair_nosql.repository;

import ec.edu.espe.jssp.sanchezjair_nosql.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    public Page<Student> findAll(Pageable pageable);

}
