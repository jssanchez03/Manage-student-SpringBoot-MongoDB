package ec.edu.espe.jssp.sanchezjair_nosql.service;

import ec.edu.espe.jssp.sanchezjair_nosql.dto.StudentDto;
import ec.edu.espe.jssp.sanchezjair_nosql.dto.StudentExistingDto;
import ec.edu.espe.jssp.sanchezjair_nosql.dto.StudentNewDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {
    StudentDto addStudent(StudentNewDto studentNewDto);
    StudentDto updateStudent(StudentExistingDto studentExistingDto);
    void deleteStudent(String studentId);
    StudentDto getStudentById(String studentId);
    Page<StudentDto> getAllStudents(Pageable pageable);
}
