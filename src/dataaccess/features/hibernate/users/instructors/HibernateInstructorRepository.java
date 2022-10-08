package dataaccess.features.hibernate.users.instructors;

import core.dataaccess.repositories.HibernateRepositoryBase;
import dataaccess.services.users.instructors.IInstructorRepository;
import domain.entities.Instructor;

public class HibernateInstructorRepository extends HibernateRepositoryBase<Instructor> implements IInstructorRepository {

}
