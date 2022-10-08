package dataaccess.features.jdbc.users.instructors;

import core.dataaccess.repositories.JdbcRepositoryBase;
import dataaccess.services.users.instructors.IInstructorRepository;
import domain.entities.Instructor;

public class JdbcInstructorRepository extends JdbcRepositoryBase<Instructor> implements IInstructorRepository {
}
