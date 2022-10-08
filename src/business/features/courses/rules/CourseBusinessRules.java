package business.features.courses.rules;

import dataaccess.services.courses.ICourseRepository;
import domain.entities.Course;

import java.util.List;

public class CourseBusinessRules {
    private final ICourseRepository _courseRepository;

    public CourseBusinessRules(ICourseRepository courseRepository) {
        _courseRepository = courseRepository;
    }

    // The List<Course> parameter is requested because there is no database.
    public void CourseNameCannotBeRepeated(String courseName, List<Course> courses) throws Exception {
        for (Course course : courses) {
            if (course.getName() == courseName) throw new Exception("Course name cannot be repeated!");
        }
    }

    public void CoursePriceCannotBeLessThan0(float price) throws Exception {
        if (price < 0) throw new Exception("Course price cannot be less than 0!");

    }
}
