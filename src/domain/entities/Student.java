package domain.entities;

import domain.entities.base.User;

import java.util.List;

public class Student extends User {
    private List<Course> _courses;
}
