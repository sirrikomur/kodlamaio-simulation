package business.services.users.students;

import domain.entities.Student;

public interface StudentService {
    void create(Student student);
    void update(Student student);
    void delete(Student student);
}
