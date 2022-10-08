package domain.entities;

import core.domain.Entity;

public class Course implements Entity {
    private int _id;
    private String _name;
    private Instructor _instructor;
}
