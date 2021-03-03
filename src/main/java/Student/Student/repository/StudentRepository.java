package Student.Student.repository;

import Student.Student.studenttable.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository

public interface StudentRepository extends JpaRepository<Student, Integer> {
    void delete(Integer id);
}
