package domain.entities.base;

import core.domain.Entity;

public class User implements Entity {
    private int _id;
    private String _firstName;
    private String _lastName;
    private String _email;
    private String _password;

    public User() {
    }

    public User(int id, String firstName, String lastName, String email, String password) {
        _id = id;
        _firstName = firstName;
        _lastName = lastName;
        _email = email;
        _password = password;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String getPassword() {
        return _password;
    }

    public void setPassword(String password) {
        _password = password;
    }
}
