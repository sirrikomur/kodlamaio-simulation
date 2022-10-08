package business.features.users.students.managers;

import business.features.users.students.rules.StudentBusinessRules;
import business.services.users.students.StudentService;
import core.logging.LogService;
import dataaccess.services.users.students.IStudentRepository;
import domain.entities.Student;

public class StudentManager implements StudentService {
    private final IStudentRepository _studentRepository;
    private final LogService _logService;
    private final StudentBusinessRules _studentBusinessRules;

    public StudentManager(IStudentRepository studentRepository, LogService logService, StudentBusinessRules studentBusinessRules) {
        _studentRepository = studentRepository;
        _logService = logService;
        _studentBusinessRules = studentBusinessRules;
    }

    @Override
    public void create(Student student) {
        _studentRepository.create(student);
        _logService.log("Student update.");
    }

    @Override
    public void update(Student student) {
        _studentRepository.create(student);
        _logService.log("Student update.");
    }

    @Override
    public void delete(Student student) {
        _studentRepository.create(student);
        _logService.log("Student delete.");
    }
}
