package business.services.courses;

import domain.entities.Course;

public interface CourseService {
    void create(Course course) throws Exception;
    void update(Course course);
    void delete(Course course);
}
