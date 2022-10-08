package dataaccess.features.jdbc.courses;

import core.dataaccess.repositories.JdbcRepositoryBase;
import dataaccess.services.courses.ICourseRepository;
import domain.entities.Course;

public class JdbcCourseRepository extends JdbcRepositoryBase<Course> implements ICourseRepository {
}
