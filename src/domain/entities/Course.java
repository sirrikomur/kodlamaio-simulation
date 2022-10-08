package domain.entities;

import core.domain.Entity;

public class Course implements Entity {
    private int _id;
    private String _name;
    private float _price;

    public Course() {
    }

    public Course(int id, String name, float price) {
        _id = id;
        _name = name;
        _price = price;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public float getPrice() {
        return _price;
    }

    public void setPrice(float price) {
        _price = price;
    }
}
