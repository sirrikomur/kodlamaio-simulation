package presentation.console;

import business.features.categories.managers.CategoryManager;
import business.features.categories.rules.CategoryBusinessRules;
import business.features.courses.managers.CourseManager;
import business.features.courses.rules.CourseBusinessRules;
import business.features.users.instructors.managers.InstructorManager;
import business.features.users.instructors.rules.InstructorBusinessRules;
import business.services.categories.CategoryService;
import business.services.courses.CourseService;
import business.services.users.instructors.InstructorService;
import core.logging.LogManager;
import core.logging.LogService;
import core.logging.loggers.DatabaseLogger;
import core.logging.loggers.FileLogger;
import core.logging.loggers.base.LoggerService;
import dataaccess.features.hibernate.categories.HibernateCategoryRepository;
import dataaccess.features.hibernate.users.instructors.HibernateInstructorRepository;
import dataaccess.features.jdbc.courses.JdbcCourseRepository;
import domain.entities.Category;
import domain.entities.Course;
import domain.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws Exception {
        /* LOGGER */
        List<LoggerService> loggerServices = new ArrayList<>();
        loggerServices.add(new DatabaseLogger());
        loggerServices.add(new FileLogger());

        LogService logService = new LogManager(loggerServices);


        /* CATEGORY */
        List<Category> categories = new ArrayList<>();
        Category category1 = new Category(1, "Programming");
        categories.add(category1);

        HibernateCategoryRepository hibernateCategoryRepository = new HibernateCategoryRepository();
        CategoryService categoryService = new CategoryManager(hibernateCategoryRepository, logService, new CategoryBusinessRules(hibernateCategoryRepository), categories);

        Category category2 = new Category(2, "Programming"); // Given the same name as category1.
        categoryService.create(category2); // Exception: Category name cannot be repeated!


        /* COURSE */
        List<Course> courses = new ArrayList<>();
        Course course1 = new Course(1, "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", 100);
        courses.add(course1);

        JdbcCourseRepository jdbcCourseRepository = new JdbcCourseRepository();
        CourseService courseService = new CourseManager(jdbcCourseRepository, logService, new CourseBusinessRules(jdbcCourseRepository), courses);

        Course course2 = new Course(2, "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", 99);
        courseService.create(course2); // Exception: Course name cannot be repeated!

        Course course3 = new Course(3, "Programlamaya Giriş İçin Temel Kurs", -25);
        courseService.create(course3); // Exception: Course price cannot be less than 0!


        /* INSTRUCTOR */
        Instructor instructor = new Instructor(1, "Engin", "Demiroğ", "engindemirog@gmail.com", "abc123*-", courses);

        InstructorService instructorService = new InstructorManager(new HibernateInstructorRepository(), logService, new InstructorBusinessRules());
        instructorService.create(instructor);
    }

}
