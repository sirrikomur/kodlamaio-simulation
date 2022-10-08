package business.services.users.instructors;

import domain.entities.Instructor;

public interface InstructorService {
    void create(Instructor instructor);
    void update(Instructor instructor);
    void delete(Instructor instructor);

}
