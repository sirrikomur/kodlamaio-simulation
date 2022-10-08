package business.features.courses.managers;

import business.features.courses.rules.CourseBusinessRules;
import business.services.courses.CourseService;
import core.logging.LogService;
import dataaccess.services.courses.ICourseRepository;
import domain.entities.Course;

import java.util.List;

public class CourseManager implements CourseService {

    private final ICourseRepository _courseRepository;
    private final LogService _logService;
    private final CourseBusinessRules _courseBusinessRules;

    // We want List<Course> because there is no database. Not clean code!
    private final List<Course> _courses;

    public CourseManager(ICourseRepository courseRepository, LogService logService, CourseBusinessRules courseBusinessRules, List<Course> courses) {
        _courseRepository = courseRepository;
        _logService = logService;
        _courseBusinessRules = courseBusinessRules;
        _courses = courses;
    }

    @Override
    public void create(Course course) throws Exception {
        _courseBusinessRules.CourseNameCannotBeRepeated(course.getName(), _courses);
        _courseBusinessRules.CoursePriceCannotBeLessThan0(course.getPrice());
        _courseRepository.create(course);
        _logService.log("Course create.");
    }

    @Override
    public void update(Course course) {
        _courseRepository.update(course);
        _logService.log("Course update.");
    }

    @Override
    public void delete(Course course) {
        _courseRepository.delete(course);
        _logService.log("Course delete.");
    }
}
