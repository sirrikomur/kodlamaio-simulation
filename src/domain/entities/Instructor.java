package domain.entities;

import domain.entities.base.User;

import java.util.List;

public class Instructor extends User {
    private List<Course> _courses;

    public Instructor() {
    }

    public Instructor(int id, String firstName, String lastName, String email, String password) {
        super(id, firstName, lastName, email, password);
    }

    public Instructor(List<Course> courses) {
        _courses = courses;
    }

    public Instructor(int id, String firstName, String lastName, String email, String password, List<Course> courses) {
        super(id, firstName, lastName, email, password);
        _courses = courses;
    }

    public List<Course> getCourses() {
        return _courses;
    }

    public void setCourses(List<Course> courses) {
        _courses = courses;
    }
}
