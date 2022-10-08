package domain.entities;

import domain.entities.base.User;

import java.util.List;

public class Instructor extends User {
    private List<Course> _courses;
}
