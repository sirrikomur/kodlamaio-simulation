package dataaccess.features.hibernate.courses;

import core.dataaccess.repositories.HibernateRepositoryBase;
import dataaccess.services.courses.ICourseRepository;
import domain.entities.Course;

public class HibernateCourseRepository extends HibernateRepositoryBase<Course> implements ICourseRepository {
}
