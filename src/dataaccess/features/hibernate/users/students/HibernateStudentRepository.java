package dataaccess.features.hibernate.users.students;

import core.dataaccess.repositories.HibernateRepositoryBase;
import dataaccess.services.users.students.IStudentRepository;
import domain.entities.Student;

public class HibernateStudentRepository extends HibernateRepositoryBase<Student> implements IStudentRepository {
}
