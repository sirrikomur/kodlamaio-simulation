package dataaccess.features.jdbc.users.students;

import core.dataaccess.repositories.JdbcRepositoryBase;
import dataaccess.services.users.students.IStudentRepository;
import domain.entities.Student;

public class JdbcStudentRepository extends JdbcRepositoryBase<Student> implements IStudentRepository {
}
