package business.features.users.instructors.managers;

import business.features.users.instructors.rules.InstructorBusinessRules;
import business.services.users.instructors.InstructorService;
import core.logging.LogService;
import core.logging.loggers.base.LoggerService;
import dataaccess.services.users.instructors.IInstructorRepository;
import domain.entities.Instructor;

import java.util.List;

public class InstructorManager implements InstructorService {
    private final IInstructorRepository _instructorRepository;
    private final LogService _logService;
    private final InstructorBusinessRules _instructorBusinessRules;

    public InstructorManager(IInstructorRepository instructorRepository, LogService logService, InstructorBusinessRules instructorBusinessRules) {
        _instructorRepository = instructorRepository;
        _logService = logService;
        _instructorBusinessRules = instructorBusinessRules;
    }

    @Override
    public void create(Instructor instructor) {
        _instructorRepository.create(instructor);
        _logService.log("Instructor create.");
    }

    @Override
    public void update(Instructor instructor) {
        _instructorRepository.update(instructor);
        _logService.log("Instructor update.");
    }

    @Override
    public void delete(Instructor instructor) {
        _instructorRepository.delete(instructor);
        _logService.log("Instructor delete.");
    }
}
